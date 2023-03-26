package main.java;

public enum Color {
    RESET ("\033[0m"),
    BLUE("\033[94m"),
    RED("\033[31m"),
    GREEN("\033[92m"),
    BlACK("\033[0m");

    public final String color;

    Color(String color) {
        this.color=color;
    }
}
