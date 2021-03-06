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
 * This servlet will create a role and add it to the database when requested by another admin.
 */
@WebServlet(
        urlPatterns = {"/createAdmin"}
)
public class CreateAdmin extends HttpServlet {
    /**
     * The User dao.
     */
    GenericDao userDao = new GenericDao(User.class);
    /**
     * The Role dao.
     */
    GenericDao roleDao = new GenericDao(Role.class);
    /**
     * The New admin.
     */
    Role newAdmin = new Role();
    final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Get method for creating a new admin
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("newAdminName");

        try {
            newAdmin = makeAdmin(newAdmin, username);
            if (req.getParameter("createAdmin").equals("createAdmin")) {
                req.setAttribute("successMessage", "Made " + username + " an Admin" );
                doPost(req, resp);
            }
        } catch (ServletException e) {
            logger.error("Error adding admin");
        } catch (IOException e) {
            logger.error("Error adding admin");
        }
    }

    /**
    *The Get method for creating a new admin
    */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            roleDao.insert(newAdmin);
        } catch (Exception e) {
            logger.error("Error adding admin");
            req.setAttribute("successMessage", "Failed to Insert Admin");
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/admin.jsp");
        dispatcher.forward(req, resp);
    }


    /**
     * Make admin role.
     *
     * @param newAdmin the new admin
     * @param username the username
     * @return the role
     */
    public Role makeAdmin(Role newAdmin, String username) {
        newAdmin.setUser((User)(userDao.getByPropertyEqual("userName", username).get(0)));
        newAdmin.setRole("admin");
        newAdmin.setUsername(username);
        return newAdmin;
    }

}