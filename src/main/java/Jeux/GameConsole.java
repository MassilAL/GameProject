package Jeux;
import views.*;

import views.Wizard;

import java.util.Scanner;

public class GameConsole {
    public static Scanner scanner=new Scanner(System.in);

    static Wizard wizard;
    static boolean isRunning;
    public static void game() {

        boolean nameSet = false;
        /*public Pet getPet() {
            return pet;
        }*/
        Scanner scanner= new Scanner(System.in);
        String NameWizard;
        //views.Wizard wizard = new views.Wizard(NameWizard, 100, 100)
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
            //views.Wizard wizard = new views.Wizard(NameWizard);
            isRunning = true;
            

        }
        System.out.println("Welcome to this game "+NameWizard);
        //System.out.println(House.values());
        Wand wand=new Wand();
        //Pet pet = new Pet();
        //Pet pet=Pet.getPet();
        System.out.println("your wand measure  "+wand.getSize() +"cm and the core is "+wand.getCore()+" congratulation!!;)\n PETTT:"/*+pet.getPet()*/);
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
        int choice=readInt("->",3);
        if(choice==1){
            System.out.println("good choice let's goo");
        }
        if(choice==2){
            printHeading("charactere info");
            System.out.println(wizard.NameWizard+"\t HP: "+ wizard.pv);
            printSeparator(1);
        }
        if(choice==3){
            System.out.println("END...");
            waiting();

        }

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

   /* public static void randomBattle() {
            clearConsole();
            printHeading("there are a creature you have to fight it!");
            waiting();
            battle(new Enemy(enemy[(int)(Math.random()*enemy.length)], enemy.pv));
        }

        public static void battle(Enemy enemy) {
            while(true){
                clearConsole();
                printHeading(enemy.name+"\nHP:"+enemy.pv+"/"+enemy.pvMax);
                printHeading(wizard.NameWizard+"\nHP:"+wizard.pv+"/"+wizard.pvMax);
                waiting();
                battle(new Enemy(enemy[(int)(Math.random()*enemy.length)], enemy.pv));
                printSeparator(1);
                System.out.println("Choice an action:");
                System.out.println("(1) fight\n(2) Use potion");
                int input=readInt("->", 2);
                if(input==1){
                    //fight
                    int damage = wizard.attack() - enemy.defence();
                    int damageTook= enemy.attack() - wizard.defence();
                    if(damageTook<0){
                        damage-=damageTook/2;
                        damageTook=0;
                    }
                    if(damage<0){
                        damage=0;
                        wizard.pv -=damageTook;
                        enemy.pv -=damage;
                        clearConsole();
                        printHeading("BATTLE");
                        System.out.println("you dealt "+damage+" damage to the "+enemy.name);
                        printSeparator(1);
                        System.out.println("The "+enemy.name+"dealt"+damageTook+" damage to you");
                        waiting();
                        if(wizard.pv<=0){
                            //end the game
                            wizardDead();
                            break;
                        } else if (enemy.pv<=0) {
                            clearConsole();
                            printHeading("You defead the"+enemy.name);
                        }

                }else if(input==2){
                        //Potion
                        clearConsole();
                        if(wizard.getPotions>0 && wizard.pv< wizard.pvMax ){
                            printHeading("You are about to take the pots: "+wizard.getPotions());
                            wizard.pv=wizard.pv+40;
                            clearConsole();
                            printHeading("You drank a magic potion, now your health back to: "+wizard.pv);
                            waiting();
                        }
                    }

                }else{
                    System.out.println("false values retry...");
                }

            }


    } */


    public static void wizardDead() {
        clearConsole();
        printHeading("you died...");
        printHeading("Thanks you and congratulation for you game");
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
