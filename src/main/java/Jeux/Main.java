package Jeux;


import views.Story;


public class Main {
    public static void main(String[] args) {


        GameConsole.game();
        Story.prtintIntro();
        //GameConsole.charactereInfo();

        GameConsole.printMenu();
        GameConsole.waiting();
        GameConsole.Fight();
        Story.firstLevel();

        /*Story.secondLevel();
        Story.thirdLevel();
        Story.fourthLevel();
        Story.fifthLevel();
        Story.sixthLevel();
        Story.seventhLevel();*/

    }
}



