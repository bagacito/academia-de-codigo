package com.bagacito.www.game.player;

import com.bagacito.www.utils.Memory;

import static com.bagacito.www.utils.RandomGenerator.getRandom;

public class Player {
    //Player Name
    private String name;

    //Player Known numbers
    private int[] knownNumbers;

    //Current known number;
    private int knownNumbersCount;

    //Memory level
    private Memory memory;

    public Player(String name, int maxGuess, Memory memory){
        this.name = name;
        this.knownNumbers = new int[maxGuess + 1];
        this.knownNumbersCount = 0;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public int getGuessNumber(int maxGuess){
        int guess = getRandom(maxGuess);
        boolean repeated = false;
        for(int number : knownNumbers){
            if(number == guess){
                repeated = true;
            }
        }

        if(repeated){
            return getGuessNumber(maxGuess);
        } else {
            return guess;
        }
    }

    private void rememberNumber(int guess){
        boolean alreadyKnows = false;

        for(int number: knownNumbers){
            if(number == guess){
                alreadyKnows = true;
            }
        }

        if(!alreadyKnows){
            knownNumbers[knownNumbersCount] = guess;
            knownNumbersCount++;
        }
    }

    public void attemptToRemember(int guess, String name){
        if(this.memory == Memory.SAY_RANDOM_NUMBERS){
            return;
        }
        if(this.memory == Memory.REMEMBER_OWN_NUMBERS){
            if(this.name == name){
                rememberNumber(guess);
            }
        }
        if(this.memory == Memory.REMEMBER_ALL_NUMBERS){
            rememberNumber(guess);
        }
    }

    public Memory getMemory() {
        return memory;
    }

    public int[] getKnownNumbers() {
        return knownNumbers;
    }
}
