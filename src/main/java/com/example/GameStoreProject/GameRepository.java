package com.example.GameStoreProject;

import java.util.ArrayList;

public class GameRepository {

    private static GameRepository gameRepository;
    private ArrayList<Game> games;

    private GameRepository() {
        this.games = new ArrayList<>();
    }

    public static GameRepository getInstance() {
        if (gameRepository == null)
            gameRepository = new GameRepository();
        return gameRepository;
    }

    public ArrayList<Game> getGames() {
        return games;
    }
}
