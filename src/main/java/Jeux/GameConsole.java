package Jeux;

import views.Color;
import views.Enemy;
import views.Wizard;

import java.util.Random;
import java.util.Scanner;

public class GameConsole {
    public static Scanner scanner=new Scanner(System.in);
    public static Random random=new Random();
    static int level=1;
    static Wizard wizard;
    static Enemy enemy;
    static boolean isRunning;
    public static void game() {

        boolean nameSet = false;
        /*public Pet getPet() {
            return pet;
        }*/
        Scanner scanner= new Scanner(System.in);
        String wizardName;
        //views.Wizard wizard = new views.Wizard(NameWizard, 100, 100)
        do {
            clearConsole();
            printSeparator(1);
            System.out.println((Color.RED.color)+"What is your name??"+(Color.RESET.color));
            printSeparator(1);
            wizardName= scanner.nextLine();
            //Object printHeading;


            printHeading("Your name is " + wizardName + ".\nIs that correct?");
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
        System.out.println("Welcome to this game "+wizardName);
        //System.out.println(House.values());
        wizard=new Wizard (wizardName, 100,100,40,50);
        //Pet pet = new Pet();
        //Pet pet=Pet.getPet();
        System.out.println("your wand measure  "+wizard.getWand().getSize() +"cm and the core is "+wizard.getWand().getCore()+" congratulation!!;)\n PET: "+ wizard.getHouse()/*+pet.getPet()*/);
        delay(4000);

    }
    //Charactere info
    public static void charactereInfo() {
        clearConsole();
        printHeading("charactere info");
        System.out.println(wizard.Name+"\t HP: "+ wizard.pv);
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
            System.out.println(wizard.Name+"\t HP: "+ wizard.pv);
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

    public static void randomBattle() {
            clearConsole();
            printHeading("there are a creature you have to fight it!");
            waiting();

        //battle(new Enemy(enemy[(int)(Math.random())], enemy.pv));
        }

        /*public static void battle() {
            while(true){
                clearConsole();
                printHeading(enemy.name+"\nHP:"+enemy.pv+"/"+enemy.pvMax);
                printHeading(wizard.NameWizard+"\nHP:"+wizard.pv+"/"+wizard.pvMax);
                waiting();
                //battle(new Enemy(enemy[(int)(Math.random())], enemy.pv));
                printSeparator(1);
                System.out.println("Choice an action:");
                System.out.println("(1) fight\n(2) Use potion");
                int input=readInt("->", 2);
                if(input==1){
                    //fight
                    int damage = wizard.attack() ;
                    int damageTook= enemy.attack() ;
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
                        System.out.println("The "+enemy.Name+"dealt"+damageTook+" damage to you");
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


    }*/



        public static void Fight() {

            Scanner input = new Scanner(System.in);
            Random random = new Random();

            

           Enemy enemy= Enemy.GenerateEnemy(level);

            System.out.println("The battles begins between " + wizard.Name + " and " + enemy.Name + " !");
            level=level+1;

            while (wizard.pv > 0 && enemy.pv > 0) {
                if (wizard.pv > 100) {
                    wizard.pv = 100;
                }
                System.out.println(wizard.Name+ " : "+wizard.pv+" hp");
                System.out.println(enemy.Name+ ":"+enemy.pv+"hp");
                System.out.println(wizard.Name + ", what do you ?");
                System.out.println("1. cast a spell");
                System.out.println("2. Drink a potion");

                // Tour de Voldemort
                if (enemy.pv > 0) {
                    int voldemortAction = random.nextInt(2) + 1;


                    int voldemortDamage = random.nextInt(enemy.damage - 20,enemy.damage);
                    wizard.pv -= voldemortDamage;
                    System.out.println(enemy.Name + " cast a spell of " + voldemortDamage + " damage on " + wizard.Name + " !");

                }
                // Tour de Harry Potter

                int harryAction = input.nextInt();

                if (harryAction == 1) {
                    int hDamage = random.nextInt(wizard.damage - 10,wizard.damage);
                    enemy.pv -= hDamage;
                    System.out.println(wizard.Name + " cast a spell " +hDamage + " damage on" + enemy.Name + " !");
                } else if (harryAction == 2) {
                    int harryPotion = random.nextInt(wizard.pv + 10,wizard.pv+30) ;
                    wizard.pv += harryPotion;

                    System.out.println(wizard.Name + "  Drink a potion that  lui rend " + harryPotion + " points de vie !\n");

                } else {
                    System.out.println("Invalid action!");
                }
                if (enemy.pv < 0) {
                    int voldemortAction = random.nextInt(2) + 1;
                    level=level+1;
                    clearConsole();
                    System.out.println("Congratulation you kill");
                    System.out.println("tu est au niveau : "+level);
                }

            }
        }




    public static void wizardDead() {
        clearConsole();
        printHeading("you die...");
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
