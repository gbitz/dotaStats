package edu.matc.controller;


import com.opendota.matches.Match;
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


/**
 * Used to filter all matches down and show last 50 matches played
 */
@WebServlet(
        urlPatterns = {"/show50Matches"}
)
public class Show50Matches extends HttpServlet {
    /**
     * The Logger.
     */
    final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The User dao.
     */
    GenericDao userDao = new GenericDao(User.class);
    /**
     * The Current user.
     */
    User currentUser;
    /**
     * The Hero stat generator.
     */
    GenerateHeroStats heroStatGenerator = new GenerateHeroStats();

    /**
     * get method for obtaining last fifty matches played
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<User> matchingUsers = userDao.getByPropertyLike("userName", req.getRemoteUser());
        String username = req.getRemoteUser();
        String steamId = matchingUsers.get(0).getSteamID();
        currentUser = getCurrentUser(username, steamId);
        List<Match> fiftyMatches;
        MatchHistory matchHistory = new MatchHistory();
        try {
            List<Match> allMatches = matchHistory.getMatches(currentUser.getSteamID());
            fiftyMatches = getLastFifty(allMatches);
            setHeroStats(fiftyMatches);
            session.setAttribute("matches", fiftyMatches);
        } catch (Exception e) {
            logger.error("Problem Finding Match History:" + e);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/50Matches.jsp");
        dispatcher.forward(req, resp);
    }

    /**
     * Sets hero stats for last fifty matches
     *
     * @param fiftyMatches the fifty matches
     */
    public void setHeroStats(List<Match> fiftyMatches) {
        int i =0;
        for (Match match: fiftyMatches) {
            i++;
            if (i == 50) {
                break;
            }
            try {
                match.setHeroImg(heroStatGenerator.getHeroStats(match.getHeroId()).getIcon());
            } catch (Exception e) {
                logger.error("Could not set Hero Stats : " + e);
            }
        }
    }

    /**
     * Gets last fifty matches played
     *
     * @param allMatches the all matches
     * @return the last fifty matches
     */
    public List<Match> getLastFifty(List<Match> allMatches) {
        List<Match> fiftyMatches = new ArrayList<>();
        int i = 0;
        for (Match match: allMatches) {
            i++;
            if (i == 50) {
                break;
            }
            fiftyMatches.add(match);
        }
        return fiftyMatches;
    }

    /**
     * Gets current user.
     *
     * @param username the username
     * @param steamId  the steam id
     * @return the current user
     */
    public User getCurrentUser(String username, String steamId) {
        User user = new User();
        user.setUserName(username);
        user.setSteamID(steamId);
        return user;
    }
}
