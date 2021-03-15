package com.example.GameStoreProject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("username");
        String password = request.getParameter("password");
        String confirm_password = request.getParameter("confirm_password");

        if (password.equals(confirm_password)) {
            UserRepository.getInstance().getUsers().add(new User(name, password));
            request.getRequestDispatcher("login.jsp").include(request, response);
        } else {
            response.getWriter().println("<font color=red>Incorrect password. Try Again</font>");
            request.getRequestDispatcher("register.jsp").include(request, response);
        }
    }
}
