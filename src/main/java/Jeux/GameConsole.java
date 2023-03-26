package main.java.Jeux;

import main.java.Color;
import main.java.Wand;
import main.java.Wizard;

import java.util.Scanner;

public class GameConsole {
    public static Scanner scanner=new Scanner(System.in);
    static Wizard wizard;
    static boolean isRunning;
    public static void game() {

        boolean nameSet = false;
        Scanner scanner= new Scanner(System.in);
        String NameWizard;
        //Wizard wizard = new Wizard(NameWizard, 100, 100)
        do {
            clearConsole();
            printSeparator(1);
            System.out.println((Color.RED.color)+"What is your name??"+(Color.RESET.color));
            printSeparator(1);
            NameWizard= scanner.nextLine();
            //Object printHeading;
            printHeading("Your name is " + NameWizard + ".\nIs that correct?");
            System.out.println("(1) YES");
            System.out.println("(2)No, I want to change my name");
            int input = readInt("->", 2);

            if (input == 1){
                nameSet = true;
            }

           /* else if (input == 2) {
                clearConsole();
                nameSet = false;

            }*/
        }while(nameSet == false);{
            //Wizard wizard = new Wizard(NameWizard);
            isRunning = true;
            

        }
        System.out.println("Welcome to this game "+NameWizard);
        Wand wand=new Wand();
        System.out.println("your wand measure  "+wand.getSize() +"cm and the core is "+wand.getCore()+" congratulation!!;)");
        delay(4000);
    }
    //Charactere info
    public static void charactereInfo() {
        clearConsole();
        printHeading("charactere info");
        System.out.println(wizard.NameWizard+"\t HP: "+ wizard.pv);
        printSeparator(1);


    }
    //the main menu
    public static void printMenu() {
        clearConsole();
        printHeading("Menu");
        System.out.println("Choose an action");
        printSeparator(1);
        System.out.println("(1) Continue");
        System.out.println("(2) Wizard info");
        System.out.println("(3) Exit game");

    }
    //main game loop
    public static void gameLoop(){
        while(isRunning){
            printMenu();
        }
    }
    //method to get user input from console
    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer!");
            }
        }while (input < 1 || input > userChoices);
            return input;
        }



        private static void printHeading(String title) {
            printSeparator(1);
            System.out.println(title);
            printSeparator(0);
        }
    public static void printSeparator(int n) {
        for(int i = 0; i < n; i++)
            System.out.println( (Color.BLUE.color)+"--------------------"+ (Color.RESET.color));

    }

    public static void clearConsole() {
        for(int i = 0; i<100; i++)
            System.out.println();

    }
    public static void delay(int time) {

        try{
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void waiting() {
        System.out.println("\nEnter anything to continue...");
        scanner.next();

    }
}
