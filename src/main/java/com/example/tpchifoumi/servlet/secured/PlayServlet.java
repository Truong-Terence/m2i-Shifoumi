package com.example.tpchifoumi.servlet.secured;

import java.io.*;

import com.example.tpchifoumi.service.Treatment;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = PlayServlet.URL)
public class PlayServlet extends HttpServlet {
    public static final String URL = "/secured/play";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/play.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recupere les données provenant du formulaire + Random
        String pChoice = request.getParameter("player-choice");
        String sChoice = Treatment.getRandomChoice();
        String result = Treatment.getResult(pChoice, sChoice);

        request.setAttribute("pChoice", pChoice);
        request.setAttribute("sChoice", sChoice);
        request.setAttribute("result", result);

        // Redirige vers la page /game-summary
        request.getRequestDispatcher("/WEB-INF/game-summary.jsp").forward(request, response);
//        response.sendRedirect(request.getContextPath() + "/secured/play");
    }
}
