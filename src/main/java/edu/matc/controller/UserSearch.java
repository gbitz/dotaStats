package edu.matc.controller;

import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


/**
 * servlet for administrators to search users
 * @author gbitzer
 */

@WebServlet(
        urlPatterns = {"/userSearch"}
)

public class UserSearch extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);
        GenericDao roleDao = new GenericDao(Role.class);
        List<Role> admins = roleDao.getByPropertyEqual("role_title", "admin");
        List<Role> users = roleDao.getByPropertyEqual("role_title","user");

        for (Role user : users) {
        }

        if (req.getParameter("submit").equals("displayUsers")) {
            req.setAttribute("users", userDao.getAll());

        }

        if (req.getParameter("submit").equals("searchUsers")) {
            req.setAttribute("users", userDao.getByPropertyEqual("userName", req.getParameter("userName")));
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/admin.jsp");
        dispatcher.forward(req, resp);
    }
}