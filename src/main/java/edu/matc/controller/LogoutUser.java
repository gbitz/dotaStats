package edu.matc.controller;



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


/**
 * Used for logging out user
 */
@WebServlet(
        urlPatterns = {"/logoutUser"}
)
public class LogoutUser extends HttpServlet {
    /**
     * Get method for logging out user
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Logger logger = LogManager.getLogger(this.getClass());
        HttpSession session = req.getSession();
        try {
            session.invalidate();
        } catch (Exception e) {
            logger.error("error closing session : " + e);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}