package com.example.tpchifoumi;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;

import java.io.IOException;

public class AuthenticacionFilter extends HttpFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest myRequest = (HttpServletRequest) request;
        HttpServletResponse myResponse = (HttpServletResponse) response;

        HttpSession session = myRequest.getSession();
        if (session.getAttribute("username" ) != null) {
//            Continue la chaîne des filtes / navigation
            chain.doFilter(request, response);
        } else {
            myResponse.sendRedirect(myRequest.getContextPath() + "/login");
        }
    }
}
