package Jeux;


import views.Story;


public class Main {
    public static void main(String[] args) {
        GameConsole.game();
        Story.ptintIntro();
        GameConsole.charactereInfo();
        GameConsole.waiting();
    }
}



