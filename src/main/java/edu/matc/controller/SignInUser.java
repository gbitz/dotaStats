package edu.matc.controller;

import com.opendota.heroStats.HeroStats;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(
        urlPatterns = {"/signInUser"}
)

public class SignInUser extends HttpServlet {
    final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao userDao = new GenericDao(User.class);
    GenericDao roleDao = new GenericDao(Role.class);
    PlayerInfo playerInfo = new PlayerInfo();
    MatchHistory matchHistory = new MatchHistory();
    GenerateHeroStats lastMatchHero = new GenerateHeroStats();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> matchingUsers= userDao.getByPropertyEqual("userName", req.getRemoteUser());
        List<Role> matchingRoles = roleDao.getByPropertyEqual("username", req.getRemoteUser());
        String username = req.getRemoteUser();
        String steamID = matchingUsers.get(0).getSteamID();
        HttpSession session = req.getSession();
        // Get Current User
        User currentUser = getCurrentUser(username, steamID);
        session.setAttribute("activeUser", currentUser);
        // Sign In
        try {
            if (playerInfo.getPlayerInfo(currentUser.getSteamID()).getProfile() != null) {
                session.setAttribute("userProfile", playerInfo.getPlayerInfo(currentUser.getSteamID()).getProfile());
                session.setAttribute("userRank", playerInfo.getPlayerInfo(currentUser.getSteamID()).getMmrEstimate().getEstimate());
                session.setAttribute("matchHistory", matchHistory.getMatches(currentUser.getSteamID()));
                session.setAttribute("lastMatchHero", lastMatchHero.getHeroStats(matchHistory.getMatches(currentUser.getSteamID()).get(0).getHeroId()));
            }
        } catch (Exception e) {
            logger.error("error signing in: " + e);
        }
        session.setAttribute("adminStatus", getAdminStatus(matchingRoles));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

    public User getCurrentUser(String username, String steamId) {
        User currentUser = new User();
        currentUser.setSteamID(steamId);
        currentUser.setUserName(username);
        return currentUser;
    }

    public Boolean getAdminStatus(List<Role> matchingRoles) {
        Boolean adminStatus = false;
        for (Role role : matchingRoles) {
            if (role.getRole().equals("admin")) {
                adminStatus = true;
            }
        }
        return adminStatus;
    }
}
