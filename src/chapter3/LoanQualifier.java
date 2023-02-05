package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS
 * To qualify for a loan, a person must make at least $30,000 and have
 * been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main (String args[]){

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get the unknown
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double actualSalary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer");
        double actualYearsEmployed = scanner.nextDouble();

        //Make decision- output
        if (actualSalary >= requiredSalary){
            if (actualYearsEmployed >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job "
                        +requiredYearsEmployed+" years");
            }
        }
        else {
            System.out.println("Sorry, you must earn at least $"
                    +requiredSalary + " to qualify for a loan");
        }

    }
}
