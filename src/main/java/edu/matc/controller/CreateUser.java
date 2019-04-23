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

@WebServlet(
        urlPatterns = {"/createUser"}
)

public class CreateUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Logger logger = LogManager.getLogger(this.getClass());

        GenericDao userDao = new GenericDao(User.class);
        User newUser = new User();

        System.out.println("!!!!!!!" + req.getParameter("createAccount"));

        if (req.getParameter("createAccount").equals("confirm")) {
            System.out.println("!");
            newUser.setUserName(req.getParameter("userName"));
            newUser.setFirstName(req.getParameter("firstName"));
            newUser.setLastName(req.getParameter("lastName"));
            newUser.setPassword(req.getParameter("password"));
            newUser.setSteamID(req.getParameter("steamID"));
        }

        userDao.saveOrUpdate(newUser);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/userResults.jsp");
//        dispatcher.forward(req, resp);
    }
}