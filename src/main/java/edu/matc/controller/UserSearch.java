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
import java.util.ArrayList;
import java.util.List;

/**
 * Admin use for searching and displaying all users.
 */
@WebServlet(
        urlPatterns = {"/userSearch"}
)
public class UserSearch extends HttpServlet {
    /**
     * get method for obtaining user list
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);
        GenericDao roleDao = new GenericDao(Role.class);

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