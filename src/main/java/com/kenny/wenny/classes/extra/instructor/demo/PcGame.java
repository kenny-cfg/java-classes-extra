package com.kenny.wenny.classes.extra.instructor.demo;

public abstract class PcGame implements Game {
    public void rollEndCredits() {
        System.out.println(getEndCredits());
    }

    public abstract void runGame();

    public final String getEndCredits() {
        return "Made with love by Uncle Ken";
    }

    public abstract String getGameName();
}
