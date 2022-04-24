package com.bagacito.www.utils;

import com.bagacito.www.game.player.Player;

public class RandomGenerator {
    public static int getRandom(int max){
        return (int) (Math.round(Math.random() * max));
    }
}
