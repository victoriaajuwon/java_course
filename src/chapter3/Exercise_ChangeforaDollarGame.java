package chapter3;

import java.util.Scanner;

/*
 * CHAPTER 3 EXERCISE: Change for a Dollar Game
 * The objective of the game is to enter enough change to equal exactly $1!
 * Create a program that asks a user t enter the quantities for the following coins: pennies, nickels
 * dimes and quarters.
 * Your program should count up the value of all the change.
 * If it's exactly $1, they win! If it is more than $1, tell them how much they went over.
 * If it is less than $1, tell them
 * by how much they went under.
 */
public class Exercise_ChangeforaDollarGame {

    public static void main(String args[]) {
        //Initialize the known values
        int NickelsToDollar = 20;
        int PenniesToDollar = 100;
        int DimesToDollar = 10;
        int QuarterToDollar = 4;
        int Short;
        int Over;

        //Get the unknown
        System.out.println("How many Pennies?");
        Scanner scanner = new Scanner(System.in);
        int PenniesQty = scanner.nextInt();
        System.out.println("How many Nickels?");
        int NickelQty = scanner.nextInt();
        System.out.println("How many Dimes?");
        int DimeQty = scanner.nextInt();
        System.out.println("How many Quarters?");
        int QuarterQty = scanner.nextInt();

        //Decision
        /*if (PenniesQty == PenniesToDollar || NickelQty == NickelsToDollar || DimeQty == DimesToDollar ||
        QuarterQty == QuarterToDollar){
         System.out.println("Congrats! You won the game");
        }
        else if (0 <=enniesQty < PenniesToDollar){
            System.out.println("You lost!");
        }*/
        if (PenniesQty > 0) {
            if (PenniesQty == PenniesToDollar) {
                System.out.println("Congrats! You won the game");
            } else if (PenniesQty < PenniesToDollar) {
                Short = PenniesToDollar - PenniesQty;
                System.out.println("You lost! You are " + Short + " Pennies short");
            } else {
                Over = PenniesQty - PenniesToDollar;
                System.out.println("You lost! You paid " + Over + " Pennies more than expected");
            }
        } else if (NickelQty > 0) {
            if (NickelQty == NickelsToDollar) {
                System.out.println("Congrats! You won the game");
            } else if (NickelQty < NickelsToDollar) {
                Short = NickelsToDollar - NickelQty;
                System.out.println("You lost! You are " + Short + " Nickels short");
            } else {
                Over = NickelQty - NickelsToDollar;
                System.out.println("You lost! You paid " + Over + " Nickels more than expected");
            }
        } else if (DimeQty > 0) {
            if (DimeQty == DimesToDollar) {
                System.out.println("Congrats! You won the game");
            } else if (DimeQty < DimesToDollar) {
                Short = DimesToDollar - DimeQty;
                System.out.println("You lost! You are " + Short + " Dimes short");
            } else {
                Over = DimeQty - DimesToDollar;
                System.out.println("You lost! You paid " + Over + " Dimes more than expected");
            }
        } else if (QuarterQty > 0) {
            if (QuarterQty == QuarterToDollar) {
                System.out.println("Congrats! You won the game");
            } else if (QuarterQty < QuarterToDollar) {
                Short = QuarterToDollar - QuarterQty;
                System.out.println("You lost! You are " + Short + " Quarter short");
            } else {
                Over = QuarterQty - QuarterToDollar;
                System.out.println("You lost! You paid " + Over + " Quarters more than expected");
            }
        }
        System.out.println("Thank you for playing the game");
    }
}

