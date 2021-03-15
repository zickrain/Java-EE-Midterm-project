package com.example.GameStoreProject;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserGameListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Game> game_list = new ArrayList<>();

        Cookie ck[] = request.getCookies();
        String username = null;
        if (ck != null) {
            int index = 0;
            while (!ck[index].getName().equals("username")) {
                index++;
            }

            username = ck[index].getValue();
        }


        request.setAttribute("game_list", game_list);
        request.getRequestDispatcher("new_game.jsp").include(request, response);


    }
}
