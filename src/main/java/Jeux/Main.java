package Jeux;


import views.Story;


public class Main {
    public static void main(String[] args) {


        GameConsole.game();
        //Story.prtintIntro();
        //GameConsole.charactereInfo();

        GameConsole.printMenu();
        Story.firstLevel();
        GameConsole.Fight();
        Story.secondLevel();
        GameConsole.Fight();
        Story.thirdLevel();
        GameConsole.Fight();
        Story.fourthLevel();
        GameConsole.Fight();
        Story.fifthLevel();
        GameConsole.Fight();
        Story.sixthLevel();
        GameConsole.Fight();
        Story.seventhLevel();
        GameConsole.Fight();

    }
}



