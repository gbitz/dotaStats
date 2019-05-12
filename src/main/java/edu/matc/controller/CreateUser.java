package edu.matc.controller;

import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.persistence.DoValidate;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Create user.
 */
@WebServlet(
        urlPatterns = {"/createUser"}
)
public class CreateUser extends HttpServlet {
    /**
     * The User dao.
     */
    GenericDao userDao = new GenericDao(User.class);
    /**
     * The Role dao.
     */
    GenericDao roleDao = new GenericDao(Role.class);
    /**
     * The New user.
     */
    User newUser = new User();
    /**
     * The New role.
     */
    Role newRole;
    /**
     * The Logger.
     */
    final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * The get method for creating a new user
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userName");
        String firstname = req.getParameter("firstName");
        String lastname = req.getParameter("lastName");
        String password = req.getParameter("password");
        String steamId = req.getParameter("steamID");



        if (req.getParameter("createAccount").equals("confirm")) {
            List<String> errors = new ArrayList<>();
            newUser = createAccount(username, firstname,lastname,password,steamId);
            errors = DoValidate.validate(newUser);
            if (!errors.isEmpty()) {
                req.setAttribute("failedUser", newUser);
                req.setAttribute("errors", errors);
                RequestDispatcher dispatcher = req.getRequestDispatcher("/signup.jsp");
                dispatcher.forward(req, resp);
            } else {
                userDao.saveOrUpdate(newUser);
            }
            newRole = setDefaultRole(newRole, newUser, username);
            doPost(req, resp);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
        dispatcher.forward(req, resp);
    }

    /**
     * The Post method for creating a new user
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            userDao.saveOrUpdate(newUser);
            roleDao.saveOrUpdate(newRole);
        } catch (Exception e) {
            logger.error("Could not create User" + e);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
        dispatcher.forward(req, resp);
    }

    /**
     * Sets default role.
     *
     * @param newRole  the new role
     * @param newUser  the new user
     * @param username the username
     * @return the default role
     */
    public Role setDefaultRole(Role newRole, User newUser, String username) {
        newRole = new Role ("user",username, newUser);
        return newRole;
    }

    /**
     * Create account user.
     *
     * @param username  the username
     * @param firstname the firstname
     * @param lastname  the lastname
     * @param password  the password
     * @param steamId   the steam id
     * @return the user
     */
    public User createAccount(String username, String firstname, String lastname, String password, String steamId) {
        User newUser = new User();
        newUser.setUserName(username);
        newUser.setFirstName(firstname);
        newUser.setLastName(lastname);
        newUser.setPassword(password);
        newUser.setSteamID(steamId);
        return newUser;
    }

}