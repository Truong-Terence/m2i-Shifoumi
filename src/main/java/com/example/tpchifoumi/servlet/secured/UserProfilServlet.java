package com.example.tpchifoumi.servlet.secured;

import com.example.tpchifoumi.model.User;
import com.example.tpchifoumi.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class UserProfilServlet extends HttpServlet {

    public static final String URL = "/secured/profil";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = new UserService();
        HttpSession session = request.getSession();
        String usernameConnected = (String) session.getAttribute("username");
        User user = userService.fetchUserByUsername(usernameConnected);

        request.setAttribute("user", user);
        request.getRequestDispatcher("/WEB-INF/profil.jsp").forward(request, response);
    }

}
