package edu.matc.controller;


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
        urlPatterns = {"/showFavoriteMatches"}
)

public class ShowFavoriteMatches extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Logger logger = LogManager.getLogger(this.getClass());
        HttpSession session = req.getSession();
        logger.debug("User:" + req.getRemoteUser());
        //Create Daos
        GenericDao userDao = new GenericDao(User.class);
        GenericDao favoriteMatchDao = new GenericDao(FavoriteMatch.class);
        //Set Current User
        User currentUser;
        List<User> matchingUser = userDao.getByPropertyLike("userName", req.getRemoteUser());
        currentUser = matchingUser.get(0);
        //Obtain Favorite Matches
        GenerateHeroStats heroStatGenerator = new GenerateHeroStats();
        MatchHistory matchHistory = new MatchHistory();
        List<FavoriteMatch> favoriteMatches = favoriteMatchDao.getByPropertyLike("username", "gbitzer");
        List<Match> allMatches = new ArrayList<>();

        try {
            allMatches = matchHistory.getMatches(currentUser.getSteamID());
        } catch (Exception e) {
            logger.error("problem obtaining all matches " + e);
        }
        List<Match> filteredMatches = new ArrayList<>();

        for (FavoriteMatch favoriteMatch : favoriteMatches) {
            for (Match match : allMatches) {
                if(match.getMatchId() == Long.parseLong(favoriteMatch.getMatchId())) {
                    filteredMatches.add(match);
                }
            }
        }

        for (Match match : filteredMatches) {
            try {
                match.setHeroImg(heroStatGenerator.getHeroStats(match.getHeroId()).getIcon());

            } catch (Exception e) {
                logger.error("Error obtaining hero stats");
            }
        }
        session.setAttribute("favoriteMatches", filteredMatches);


        RequestDispatcher dispatcher = req.getRequestDispatcher("/favoriteMatches.jsp");
        dispatcher.forward(req, resp);
    }
}
