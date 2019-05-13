package edu.matc.controller;

import edu.matc.entity.Role;
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
 * Class for editing a users SteamID
 */
@WebServlet(
        urlPatterns = {"/editUser"}
)
public class EditUser extends HttpServlet {
    /**
     * The Logger.
     */
    final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Post method for editing a users steamId
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao userDao = new GenericDao(User.class);
        User userToEdit;
        if (req.getParameter("editAccount").equals("confirm")) {
            userToEdit = (User)userDao.getByPropertyEqual("userName", req.getRemoteUser()).get(0);
            userToEdit.setSteamID(req.getParameter("steamID"));
            userDao.saveOrUpdate(userToEdit);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/logoutUser");
        dispatcher.forward(req, resp);
    }
}