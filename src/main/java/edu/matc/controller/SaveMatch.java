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
    FavoriteMatch matchToAdd;
    GenericDao favoriteMatchDao = new GenericDao(FavoriteMatch.class);
    final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao userDao = new GenericDao(User.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> currentUsers = userDao.getByPropertyEqual("userName", req.getRemoteUser());
        String successMessage;
        String matchId = req.getParameter("saveMatch");
        User currentUser = currentUsers.get(0);
        String username = req.getRemoteUser();

        try {
            matchToAdd = createFavoriteMatch(matchId, currentUser, username);
            if (favoriteMatchDao.getByPropertyLike("matchId", req.getParameter("saveMatch")).isEmpty()) {
                successMessage = "Added Match " + matchToAdd.getMatchId() + " to Favorites";
                req.setAttribute("successMessage", successMessage);
                doPost(req,resp);
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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        favoriteMatchDao.insert(matchToAdd);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/matchDetails.jsp");
        dispatcher.forward(req, resp);
    }

    public FavoriteMatch createFavoriteMatch(String matchId, User currentUser, String username) {
        FavoriteMatch favoriteMatch = new FavoriteMatch();
        favoriteMatch.setMatchId(matchId);
        favoriteMatch.setUser(currentUser);
        favoriteMatch.setUsername(username);
        return favoriteMatch;
    }
}
