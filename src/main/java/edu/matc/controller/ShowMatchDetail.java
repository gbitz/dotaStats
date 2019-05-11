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
    final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MatchDetail matchDetail = new MatchDetail();
        GenerateMatchDetail generateMatchDetail = new GenerateMatchDetail();
        List<PlayersItem> radiant = new ArrayList<>();
        List<PlayersItem> dire = new ArrayList<>();

        //Generate Hero Stats
        GenerateHeroStats generateHeroStats = new GenerateHeroStats();

        //Generate Match Detail
        try {
            matchDetail = generateMatchDetail.getMatchDetail(Long.parseLong(req.getParameter("matchIdDetail")));
        } catch (Exception e) {
            logger.error("error generating match detail: " + e);
        }

        //Generate Player Stats
        try {
            List<PlayersItem> players = matchDetail.getPlayers();
            for (PlayersItem player : players){
                player.setHeroImg(generateHeroStats.getHeroStats(player.getHeroId()).getImg());
                if(player.getPersonaname() == null) {
                    player.setPersonaname("*Private Account*");
                }
                if (player.isIsRadiant() == true) {
                    radiant.add(player);
                } else {
                    dire.add(player);
                }
            }
            req.setAttribute("radiant", radiant);
            req.setAttribute("dire", dire);
            req.setAttribute("generalDetail", matchDetail);
        } catch (Exception e) {
            logger.error("show match detail error" + e);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/matchDetails.jsp");
        dispatcher.forward(req, resp);
    }
}
