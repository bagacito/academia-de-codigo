package com.bagacito.www.game;

import com.bagacito.www.game.player.Player;

import static com.bagacito.www.utils.RandomGenerator.getRandom;

public class GameController {
    //Max guess number
    private int MAX_GUESS;

    //Max Rounds number
    private int MAX_ROUNDS;

    public GameController(int maxGuess, int maxRounds){
        this.MAX_GUESS = maxGuess;
        this.MAX_ROUNDS = maxRounds;

    }

    public void startGame(Player[] players){
       int machineGuess = getRandom(MAX_GUESS);
       int currentRound = 1;
       boolean endGame = false;

       while(!endGame){
           System.out.println("#####  " + "Round " + currentRound + "  #####");

           for (Player player : players) {
               int guessNumber = player.getGuessNumber(this.MAX_GUESS);
               System.out.println(player.getName() + ": " + guessNumber);

               if(guessNumber == machineGuess){
                   endGame = true;
                   System.out.println(player.getName() + " Wins!!!");
                   return;
               }

               for (Player playerOne: players){
                   playerOne.attemptToRemember(guessNumber, player.getName());
               }
           }

           if(currentRound == this.MAX_ROUNDS){
               endGame = true;
               System.out.println("Machine wins the selected number was: " + machineGuess);
           }

           currentRound++;
       }

    }

}
