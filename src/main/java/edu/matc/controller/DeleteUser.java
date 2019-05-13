package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Will Delete User from database
 */
@WebServlet(
        urlPatterns = {"/deleteUser"}
)
public class DeleteUser extends HttpServlet {
    /**
     * The Logger.
     */
    final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Post Method for deleting a user from database
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao userDao = new GenericDao(User.class);
        User userToDelete;
        if (req.getParameter("deleteUser").equals("deleteUser")) {
            userToDelete = (User)userDao.getByPropertyEqual("userName", req.getParameter("userToDelete")).get(0);
            logger.info("Attempting to delete user : " + userToDelete);
            try {
                userDao.delete(userToDelete);
                req.setAttribute("successMessage", "Deleted User : " + userToDelete.getUserName());
            } catch (Exception e) {
                logger.error("Failed to Delete User" + e);
                req.setAttribute("successMessage", "Failed to Delete Deleted User : " + userToDelete.getUserName());

            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/admin.jsp");
        dispatcher.forward(req, resp);
    }
}