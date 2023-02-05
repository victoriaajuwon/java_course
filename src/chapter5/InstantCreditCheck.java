package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'Instant credit check' program that approves
 * anyone who makes more tan $25,000 and has a credit score
 * of 700 or better. Reject all
 */
public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[]args){

        //Initiate what we know

        //Get what we don't know
        double actualSalary = getSalary();
        int actualCreditScore = getCreditScore();
        scanner.close();
        //Check if the user is qualified
        boolean qualified = isUserQualified(actualCreditScore, actualSalary);

        //Notify the user
        notifyUser(qualified);

    }

    //Get user's information

    public static double getSalary(){
        //Get user's salary
        System.out.println("Enter your salary");
        double actualSalary = scanner.nextDouble();
        return actualSalary;
    }

    public static int getCreditScore(){
        //Get user's credit score
        System.out.println("Enter your credit score");
        int actualCreditScore = scanner.nextInt();
        return actualCreditScore;
    }

    //Check qualification.
    public static boolean isUserQualified(int CreditScore, double Salary){
        if (CreditScore >= requiredCreditScore && Salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved");
        }
        else{
            System.out.println("Sorry, You've been declined");
        }
    }
}
