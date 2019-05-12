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
    final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao userDao = new GenericDao(User.class);
    GenericDao favoriteMatchDao = new GenericDao(FavoriteMatch.class);
    GenerateHeroStats heroStatGenerator = new GenerateHeroStats();
    MatchHistory matchHistory = new MatchHistory();
    List<Match> filteredMatches = new ArrayList<>();
    List<Match> allMatches = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Set Current User
        User currentUser = (User)userDao.getByPropertyLike("userName", req.getRemoteUser()).get(0);
        //Obtain Favorite Matches
        List<FavoriteMatch> favoriteMatches = favoriteMatchDao.getByPropertyLike("username", req.getRemoteUser());
        //Reset Filtered Matches
        filteredMatches.clear();
        try {
            allMatches = matchHistory.getMatches(currentUser.getSteamID());
        } catch (Exception e) {
            logger.error("problem obtaining all matches " + e);
        }
        filterToFavorites(favoriteMatches, allMatches);
        setHeroStats(filteredMatches);
        req.setAttribute("favoriteMatches", filteredMatches);
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/favoriteMatches.jsp");
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");
        resp.setDateHeader ("Expires", -1);
        dispatcher.forward(req, resp);
    }



        public void filterToFavorites(List<FavoriteMatch> favoriteMatches, List<Match> allMatches){
        for (FavoriteMatch favoriteMatch : favoriteMatches) {
            for (Match match : allMatches) {
                if(match.getMatchId() == Long.parseLong(favoriteMatch.getMatchId())) {
                    filteredMatches.add(match);
                }
            }
        }
    }

    public void setHeroStats(List<Match> filteredMatches) {
        for (Match match : filteredMatches) {
            try {
                match.setHeroImg(heroStatGenerator.getHeroStats(match.getHeroId()).getIcon());

            } catch (Exception e) {
                logger.error("Error obtaining hero stats");
            }
        }
    }


}
