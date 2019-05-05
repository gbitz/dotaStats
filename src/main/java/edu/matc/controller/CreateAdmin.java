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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Logger logger = LogManager.getLogger(this.getClass());

        GenericDao userDao = new GenericDao(User.class);
        GenericDao roleDao = new GenericDao(Role.class);

        Role newAdmin = new Role();
        newAdmin.setUser((User)(userDao.getByPropertyEqual("userName", req.getParameter("newAdminName"))).get(0));
        newAdmin.setRole("admin");
        newAdmin.setUsername(req.getParameter("newAdminName"));

        if (req.getParameter("createAdmin").equals("createAdmin")) {

            roleDao.insert(newAdmin);



        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/admin.jsp");
        dispatcher.forward(req, resp);
    }
}