package edu.matc.controller;

import com.opendota.heroStats.HeroStats;
import com.opendota.matchDetail.MatchDetail;
import com.opendota.matchDetail.PlayersItem;
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
        urlPatterns = {"/showMatchDetail"}
)

public class ShowMatchDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Logger logger = LogManager.getLogger(this.getClass());
        HttpSession session = req.getSession();
        logger.debug("User:" + req.getRemoteUser());
        GenericDao userDao = new GenericDao(User.class);

        GenerateMatchDetail generateMatchDetail = new GenerateMatchDetail();
        try {
            List<PlayersItem> players = generateMatchDetail.getMatchDetail(Long.parseLong(req.getParameter("matchIdDetail"))).getPlayers();
            session.setAttribute("players", generateMatchDetail.getMatchDetail(Long.parseLong(req.getParameter("matchIdDetail"))).getPlayers());
            for (PlayersItem player : players){
                player.getHeroId();
            }


        } catch (Exception e) {
            logger.error("show match detail error" + e);
        }


        RequestDispatcher dispatcher = req.getRequestDispatcher("/matchDetails.jsp");
        dispatcher.forward(req, resp);
    }
}
