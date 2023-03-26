package main.resources;

import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.List;

import static main.java.Jeux.GameConsole.scanner;

import jdk.internal.icu.impl.CharacterIteratorWrapper;

public class Game {
    public void startGame(){
        boolean nameSet = false;
        String name;
        //title screen
        clearConsole();
        printSeparator(40);
        printSeparator(30);
        System.out.println("Welcome to poudlard ");
        printSeparator(40);
        printSeparator(30);
        waiting();

    }

    public static void printSeparator(int n) {
        for(int i = 0; i < n; i++)
            System.out.println("-");
        System.out.println();
    }

    public static void waiting() {
        System.out.println("\nEnter anything to continue...");
        CharacterIteratorWrapper scanner = null;
        scanner.next();

    }
    public static void clearConsole() {
        for(int i = 0; i>100; i++)
            System.out.println();

    }

}
