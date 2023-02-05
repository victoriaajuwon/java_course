package chapter2;

import java.util.Scanner;

public class Exercise_MadLib {

    public static void main(String args[]){

        //1. Get season of the year
        System.out.println("Enter your favorite season of the year");
        Scanner scanner = new Scanner(System.in);
        String seasonOfTheYear = scanner.next();

        //2. Get a whole number
        System.out.println("Enter an whole number");
        int wholeNumber = scanner.nextInt();

        //3. Get an adjective
        System.out.println("Enter any adjective");
        String favAdjective = scanner.next();
        scanner.close();

        //4. Display complete sentence with the user's inputs
        System.out.println("On a "+favAdjective+ " "+seasonOfTheYear+ " day, I drink a minimum of "+wholeNumber+ " cups of coffee.");
    }
}
