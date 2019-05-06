package edu.matc.controller;

import com.opendota.heroStats.HeroStats;
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
        logger.debug("User:" + req.getRemoteUser());
        GenericDao userDao = new GenericDao(User.class);
        List<User> matchingUser;
        matchingUser = userDao.getByPropertyLike("userName", req.getRemoteUser());


        User currentUser = new User();
        currentUser.setUserName(req.getRemoteUser());


            session.setAttribute("activeUser", matchingUser.get(0));
            currentUser.setSteamID(matchingUser.get(0).getSteamID());



        PlayerInfo playerInfo = new PlayerInfo();
        MatchHistory matchHistory = new MatchHistory();
        GenerateHeroStats lastMatchHero = new GenerateHeroStats();


//        https://api.opendota.com/apps/dota2/images/heroes/slardar_full.png
        try {
            session.setAttribute("userProfile", playerInfo.getPlayerInfo(currentUser.getSteamID()).getProfile());
            session.setAttribute("userRank", playerInfo.getPlayerInfo(currentUser.getSteamID()).getMmrEstimate().getEstimate());
            session.setAttribute("matchHistory", matchHistory.getMatches(currentUser.getSteamID()));
            session.setAttribute("lastMatchHero", lastMatchHero.getHeroStats(matchHistory.getMatches(currentUser.getSteamID()).get(0).getHeroId()));
        } catch (Exception e) {
            logger.debug("error signing in: " + e);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}
