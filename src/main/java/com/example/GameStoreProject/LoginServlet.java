package com.example.GameStoreProject;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("username");
        String password = request.getParameter("password");

        User user = UserRepository.getInstance().getUser(name);
        if (user!= null) {
            if (user.getUsername().equals(name) && user.getPassword().equals(password)) {
                Cookie cookie = new Cookie("username", name);
                cookie.setMaxAge(60 * 30);
                response.addCookie(cookie);
                request.getRequestDispatcher("account.jsp").include(request, response);
            } else {
                request.getRequestDispatcher("index.jsp").include(request, response);
            }
        } else {
            request.getRequestDispatcher("index.jsp").include(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }
}
