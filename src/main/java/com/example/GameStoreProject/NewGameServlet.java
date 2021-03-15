package com.example.GameStoreProject;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewGameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = null;
        String title = request.getParameter("title");
        String price = request.getParameter("price");
        String description = request.getParameter("description");

        Cookie ck[] = request.getCookies();

        if (ck != null) {
            int i = 0;
            while (!ck[i].getName().equals("username")) {
                i++;
            }

            username = ck[i].getValue();
        }

        GameRepository.getInstance().getGames().add(new Game(title, price, description));

        request.setAttribute("message", "The note has been  added");
        request.getRequestDispatcher("new_game.jsp").include(request, response);

    }
}
