package com.example.tpchifoumi.filter;

import com.example.tpchifoumi.servlet.anonymous.LoginServlet;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebFilter(urlPatterns = "/secured/*")
public class AuthenticationFilter extends HttpFilter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        HttpSession session = request.getSession();
        if (session.getAttribute("username") != null) {
            chain.doFilter(req, resp);
        } else {
            response.sendRedirect(request.getContextPath() + LoginServlet.URL);
        }
    }
}

