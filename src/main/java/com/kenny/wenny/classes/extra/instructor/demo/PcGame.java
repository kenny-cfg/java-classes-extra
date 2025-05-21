package com.kenny.wenny.classes.extra.instructor.demo;

public abstract class PcGame {
    public void rollEndCredits() {
        System.out.println(getEndCredits());
    }

    public abstract void runGame();

    public final String getEndCredits() {
        return "Made with love by Uncle Ken";
    }

    public abstract String getGameName();
    /*
Follow along with your instructor to make an abstract class - ‘PcGame’

We will have different PcGames, but all will have the following as
standard:
 Attributes
 String endCredits
 Same for all subclasses
 String gameName
 Varies per subclass
 Methods
 rollEndCredits()
 This is the same for all, and prints out endCredits
 runGame()
 Varies between the games
     */
}
