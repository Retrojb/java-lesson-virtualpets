package org.example;

import java.util.Scanner;
/* 
 Git checkout main `git checkout main`
 Cut a new branch shortName-projectName
 Find the bugs
 Add this extra functionality:
    All animals need their sleep
    All animals like to play
    We need to check that our Animals alive during our loop
    We need to make sure that
 Add a README.md with answers to the following questions:
        * Hint: try using touch to create this file from the cmd line,
    Explain String.Format();
    Explain Class, Interface;
    Explain what you would improve aka nice to haves
    Explain parameters, how to you invoke a function / method call
    What is a method / function signature
    Explain public vs private variables and methods
    Why do we add String || int || Pet before our variables
 commit code back 
 open a PR to let me know you're finished
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pet pet = new Pet("",70, 70);
        System.out.println("Welcome to Virtual Pet");
        System.out.println("Please give your pet a name");
        String petName = input.nextLine();
        pet.setName(petName);
        System.out.println(String.format(" %s says hello", petName));
        for (int i=0; i < 25; i++) {
            System.out.println(String.format("What would you like to do: \n%s \n%s \n%s \n%s \n%s \n%s", "Press 1: to Feed a small meal", "Press 2: to give water", "Press 3: to feed a large meal", "Press 4: to play tug of war", "Press 5: to play fetch", "Press 6: to take a nap"));
            System.out.println(String.format("Pets life:%x \nCurrent turn:%x of %x", pet.getPetLifeEnergy(), i, 25));
            String userSelection = input.nextLine();
            commandPrompts(pet, userSelection);
        }
    }
    public static void commandPrompts (Pet pet, String userSelection) {
        String petName = pet.getName();
        int petThirst = pet.getThirst();
        int petHunger = pet.getHunger();
        switch (userSelection) {
            case("1"):
                pet.eatSmMeal();
                System.out.println(String.format("You feed %s, hunger is: %x", petName, petHunger));
                break;
            case("2"):
                pet.drink();
                System.out.println(String.format("You gave %s some water, thirst is: %x", petName, petThirst));
                break;
            case("3"):
                pet.eatLrgMeal();
                break;
            case("4"):
                pet.playTugOfWar();
                break;
            case ("5"):
                pet.playFetch();
                break;
            case("6"):
                pet.sleep();
                break;
            default:
                System.out.println("You did nothing");
                break;
        }
    }
}