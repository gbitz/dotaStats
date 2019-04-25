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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        urlPatterns = {"/signInUser"}
)

public class SignInUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Logger logger = LogManager.getLogger(this.getClass());

        HttpSession session = req.getSession();
        GenericDao userDao = new GenericDao(User.class);
        List<User> matchingUser;
        matchingUser = userDao.getByPropertyLike("userName", req.getParameter("userName"));


        User currentUser = new User();
        currentUser.setPassword(req.getParameter("password"));
        currentUser.setUserName(req.getParameter("userName"));

        
        if (req.getParameter("signIn").equals("confirm")) {
            if (currentUser.getPassword() == matchingUser.get(0).getPassword());
            session.setAttribute("activeUser", matchingUser.get(0));
        }


        PlayerInfo playerInfo = new PlayerInfo();
        try {
            session.setAttribute("userProfile", playerInfo.getPlayerInfo(currentUser.getSteamID()).getProfile());
        } catch (Exception e) {
            e.printStackTrace();
        }


        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}
