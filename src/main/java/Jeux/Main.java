package main.java.Jeux;

import main.java.Story;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameConsole.game();
        Story.ptintIntro();
        GameConsole.charactereInfo();
        GameConsole.waiting();
    }
}



