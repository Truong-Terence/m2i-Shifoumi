package com.example.tpchifoumi.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("Térence") && password.equals("Truong")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", "Térence");
            response.sendRedirect(request.getContextPath() + "/");
        } else {
            request.setAttribute("isError", true);

            request
                    .getRequestDispatcher("WEB-INF/login.jsp")
                    .forward(request, response);
        }
    }
}
