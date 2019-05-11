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

@WebServlet(
        urlPatterns = {"/createAdmin"}
)

public class CreateAdmin extends HttpServlet {
    GenericDao userDao = new GenericDao(User.class);
    GenericDao roleDao = new GenericDao(Role.class);
    Role newAdmin = new Role();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Logger logger = LogManager.getLogger(this.getClass());
        String username = req.getParameter("newAdminName");
        newAdmin = makeAdmin(newAdmin, username);

        if (req.getParameter("createAdmin").equals("createAdmin")) {
            doPost(req, resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        roleDao.insert(newAdmin);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/admin.jsp");
        dispatcher.forward(req, resp);
    }


    public Role makeAdmin(Role newAdmin, String username) {
        newAdmin.setUser((User)(userDao.getByPropertyEqual("userName", username).get(0)));
        newAdmin.setRole("admin");
        newAdmin.setUsername(username);
        return newAdmin;
    }

}