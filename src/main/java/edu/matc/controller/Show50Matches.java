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


@WebServlet(
        urlPatterns = {"/show50Matches"}
)

public class Show50Matches extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Logger logger = LogManager.getLogger(this.getClass());
        HttpSession session = req.getSession();
        logger.debug("User:" + req.getRemoteUser());
        GenericDao userDao = new GenericDao(User.class);
        List<User> matchingUser = userDao.getByPropertyLike("userName", req.getRemoteUser());
        User currentUser = new User();
        currentUser.setUserName(req.getRemoteUser());
        session.setAttribute("activeUser", matchingUser.get(0));
        currentUser.setSteamID(matchingUser.get(0).getSteamID());
        GenerateHeroStats heroStatGenerator = new GenerateHeroStats();
        int i = 0;
        List<Match> fiftyMatches = new ArrayList<>();
        MatchHistory matchHistory = new MatchHistory();
        try {
            List<Match> allMatches = matchHistory.getMatches(currentUser.getSteamID());
            for (Match match: allMatches) {
                i++;
                if (i == 50) {
                    break;
                }
                fiftyMatches.add(match);
            }
            for (Match match : fiftyMatches) {
                i++;
                if (i == 100) {
                    break;
                }
                match.setHeroImg(heroStatGenerator.getHeroStats(match.getHeroId()).getIcon());
            }
            session.setAttribute("matches", fiftyMatches);
        } catch (Exception e) {
            logger.error("Problem Finding Match History:" + e);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/50Matches.jsp");
        dispatcher.forward(req, resp);
    }
}
