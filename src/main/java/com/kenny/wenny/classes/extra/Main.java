package com.kenny.wenny.classes.extra;

import com.kenny.wenny.classes.extra.instructor.demo.EducationalGame;
import com.kenny.wenny.classes.extra.instructor.demo.FarmingGame;
import com.kenny.wenny.classes.extra.instructor.demo.Game;

public class Main {
    public static void main(String[] args) {
        var farmingGameInstance = new FarmingGame();
        runGame(farmingGameInstance);
        var educationalGameInstance = new EducationalGame();
        runGame(educationalGameInstance);
    }

    public static void runGame(Game game) {
        game.pooBum();
    }
}