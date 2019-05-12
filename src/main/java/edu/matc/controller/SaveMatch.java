package edu.matc.controller;

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
import java.io.IOException;

import java.util.List;


/**
 * Used for saving a match to the database
 */
@WebServlet(
        urlPatterns = {"/saveMatch"}
)
public class SaveMatch extends HttpServlet {
    /**
     * The Match to add.
     */
    FavoriteMatch matchToAdd;
    /**
     * The Favorite match dao.
     */
    GenericDao favoriteMatchDao = new GenericDao(FavoriteMatch.class);
    /**
     * The Logger.
     */
    final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The User dao.
     */
    GenericDao userDao = new GenericDao(User.class);

    /**
     * get method for saving a favorite match
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
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
        RequestDispatcher dispatcher = req.getRequestDispatcher("showFavoriteMatches");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        favoriteMatchDao.insert(matchToAdd);
        RequestDispatcher dispatcher = req.getRequestDispatcher("showFavoriteMatches");
        dispatcher.forward(req, resp);
    }

    /**
     * Create favorite match to be saved
     *
     * @param matchId     the match id
     * @param currentUser the current user
     * @param username    the username
     * @return the favorite match
     */
    public FavoriteMatch createFavoriteMatch(String matchId, User currentUser, String username) {
        FavoriteMatch favoriteMatch = new FavoriteMatch();
        favoriteMatch.setMatchId(matchId);
        favoriteMatch.setUser(currentUser);
        favoriteMatch.setUsername(username);
        return favoriteMatch;
    }
}
