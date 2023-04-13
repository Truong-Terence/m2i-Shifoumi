package com.example.tpchifoumi.servlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = "/play")
public class playServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/play.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recupere les données provenant du formulaire
        String choice = null;
        if (!(null == request.getParameter("shi"))) {
            choice = request.getParameter("shi");
        } else if (!(null == request.getParameter("fou"))) {
            choice = request.getParameter("fou");
        } else if (!(null == request.getParameter("mi"))) {
            choice = request.getParameter("mi");
        }

        request.setAttribute("choice", choice);

        // Redirige vers la page /posts
//        response.sendRedirect("summary");
        request.getRequestDispatcher("/WEB-INF/game-summary.jsp").forward(request, response);

        System.out.println(choice);
    }
}
