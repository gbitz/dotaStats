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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


/**
 * Used for signing in an existing user
 */
@WebServlet(
        urlPatterns = {"/signInUser"}
)
public class SignInUser extends HttpServlet {
    /**
     * The Logger.
     */
    final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The User dao.
     */
    GenericDao userDao = new GenericDao(User.class);
    /**
     * The Role dao.
     */
    GenericDao roleDao = new GenericDao(Role.class);
    /**
     * The Player info.
     */
    PlayerInfo playerInfo = new PlayerInfo();
    /**
     * The Match history.
     */
    MatchHistory matchHistory = new MatchHistory();
    /**
     * The Last match hero.
     */
    GenerateHeroStats lastMatchHero = new GenerateHeroStats();

    /**
     * Get method for signing in an existing user
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
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

    /**
     * Gets current user.
     *
     * @param username the username
     * @param steamId  the steam id
     * @return the current user
     */
    public User getCurrentUser(String username, String steamId) {
        User currentUser = new User();
        currentUser.setSteamID(steamId);
        currentUser.setUserName(username);
        return currentUser;
    }

    /**
     * Gets admin status.
     *
     * @param matchingRoles the matching roles
     * @return the admin status
     */
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
