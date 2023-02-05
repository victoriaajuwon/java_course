package chapter4;

import java.util.Scanner;

/*
 * NESTED LOOPS
 * Find the average test scores for each student in the class.
 * There are 24 students and 4 tests.
 */
public class AverageTestScores {
    
    public static void main(String args[]){
        
        // Initialize what we know
        int numberOfStudent = 24;
        int numberOfTests = 4;
        
        // Get what we don't know
        Scanner scanner = new Scanner(System.in);
        
        //Process all student
        for (int i = 0; i<numberOfStudent; i++){
            
            double total = 0;
            for (int j= 0; j<numberOfTests; j++){
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total +score;
            }
            
            double average = total/numberOfTests;
            System.out.println("The test average of student #" + (i+1) + " is " + average);
        }
        
        scanner.close();
    }
}
