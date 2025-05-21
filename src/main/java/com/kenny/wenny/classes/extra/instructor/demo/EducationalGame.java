package com.kenny.wenny.classes.extra.instructor.demo;

public class EducationalGame extends PcGame {
    @Override
    public void runGame() {
        System.out.println("Learn your spellings, you horrible children");
    }

    @Override
    public String getGameName() {
        return "Educational Game";
    }
}
