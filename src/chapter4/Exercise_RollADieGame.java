package chapter4;
/*
 * CHAPTER 4 EXERCISE: ROLL THE DIE GAME (EXERCISE_ROLL THE DIE GAME)
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of
 * spaces on the game board. Here’s the code to do this ((import is java.util.Random).
 * After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
 * Repeat this 4 additional times, for 5 rolls in total.
 * However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
 * If they are greater than or less than 20 spaces exactly, they lose.
 * Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug
 */

import java.util.Random;

public class Exercise_RollADieGame {

    public static void main(String[] args){

        //Initialize known values
        int maxRoll =5;
        int totalBoardSpace = 20;
        int currentBoardSpace = 0;
        int SpaceLeft;

        //Initialize random method
        Random random = new Random();

        //process loop
        for (int i=1; i<=maxRoll; i++){
            //Call random method
            int die = random.nextInt(6) + 1;

            // Move user to right board space based on die roll
            currentBoardSpace = currentBoardSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));
            // check whether user is on board space 20
            if (currentBoardSpace == totalBoardSpace){
                System.out.print("You are now on space " +currentBoardSpace+ ". Congrats, you win!");
                break;
            }
            else if (currentBoardSpace > totalBoardSpace){
                System.out.print("Unfortunately that takes you past " +totalBoardSpace+ " spaces. You lose!");
                break;
            }
            else if (i==maxRoll && currentBoardSpace <totalBoardSpace){
                System.out.println("You're on space " +currentBoardSpace+ ".");
                System.out.println("Unfortunately, you didn't make it to all " +totalBoardSpace+ " spaces. " +
                        "You lose!");
            }
            else {
                SpaceLeft = totalBoardSpace - currentBoardSpace;
                System.out.print("You're on space " +currentBoardSpace+ " and have " +SpaceLeft+ " more to go");
            }
            System.out.println();
        }
    }
}
