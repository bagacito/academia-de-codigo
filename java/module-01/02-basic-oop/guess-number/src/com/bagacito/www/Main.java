package com.bagacito.www;

import com.bagacito.www.game.GameController;
import com.bagacito.www.game.player.Player;
import com.bagacito.www.utils.Memory;

public class Main {
    public static void main(String[] args) {
        int MAX_GUESS = 10;
        int MAX_ROUNDS = 10;

        Player[] players = {
            new Player("Ruben", MAX_GUESS, Memory.REMEMBER_OWN_NUMBERS),
            new Player("Rita", MAX_GUESS, Memory.REMEMBER_OWN_NUMBERS),
            new Player("Nuno", MAX_GUESS, Memory.SAY_RANDOM_NUMBERS),
            new Player("Sergio", MAX_GUESS, Memory.REMEMBER_ALL_NUMBERS)
        };

        GameController gameController = new GameController(MAX_GUESS, MAX_ROUNDS);

        gameController.startGame(players);

    }
}
