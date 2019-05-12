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

@WebServlet(
        urlPatterns = {"/createUser"}
)

public class CreateUser extends HttpServlet {
    GenericDao userDao = new GenericDao(User.class);
    GenericDao roleDao = new GenericDao(Role.class);
    User newUser = new User();
    Role newRole;
    final Logger logger = LogManager.getLogger(this.getClass());
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
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userDao.saveOrUpdate(newUser);
        roleDao.saveOrUpdate(newRole);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
        dispatcher.forward(req, resp);
    }

    public Role setDefaultRole(Role newRole, User newUser, String username) {
        newRole = new Role ("user", newUser);
        newRole.setUsername(username);
        return newRole;
    }

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