package edu.matc.controller;

import com.opendota.heroStats.HeroStats;
import com.opendota.matchDetail.MatchDetail;
import com.opendota.matchDetail.PlayersItem;
import com.opendota.matches.Match;
import edu.matc.entity.FavoriteMatch;
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
        urlPatterns = {"/saveMatch"}
)

public class SaveMatch extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Logger logger = LogManager.getLogger(this.getClass());
        HttpSession session = req.getSession();
        logger.debug("User:" + req.getRemoteUser());
        FavoriteMatch matchToAdd = new FavoriteMatch();
        GenericDao favoriteMatchDao = new GenericDao(FavoriteMatch.class);
        GenericDao userDao = new GenericDao(User.class);
        List<User> currentUsers = userDao.getByPropertyEqual("userName", req.getRemoteUser());
        String successMessage;


        try {
            matchToAdd.setMatchId(req.getParameter("saveMatch"));
            matchToAdd.setUser(currentUsers.get(0));
            matchToAdd.setUsername(req.getRemoteUser());
            if (favoriteMatchDao.getByPropertyLike("matchId", req.getParameter("saveMatch")).isEmpty()) {
                favoriteMatchDao.insert(matchToAdd);
                successMessage = "Added Match " + matchToAdd.getMatchId() + " to Favorites";
            } else {
                successMessage = "Match " + matchToAdd.getMatchId() + " is Already Added";
            }

        } catch (Exception e) {
            successMessage = "Could Not Add Match " + matchToAdd.getMatchId() + "To Favorites";
            logger.error("Could not add match to Favorites: " + e);
        }

        req.setAttribute("successMessage", successMessage);


        RequestDispatcher dispatcher = req.getRequestDispatcher("/matchDetails.jsp");
        dispatcher.forward(req, resp);
    }
}
