package chapter4;

/*
*ROLL THE DIE GAME
* The objective of this game is to travel the entire game board
* of 20 spaces within 5 die rolls.
* Roll the die for the user (generate a Random number between 1 – 6)
* After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
* Repeat this 4 additional times, for 5 rolls in total.
* However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
* If they are greater than or less than 20 spaces exactly, they lose.
* Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
*/

import java.util.Random;

public class RollTheDieGame {

    public static void main(String args[]){
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int i=1; i<=maxRolls; i++){

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if(currentSpace == lastSpace){
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            }
            else if(currentSpace > lastSpace){
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            }
            else if(i==maxRolls && currentSpace < lastSpace){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        lastSpace + " spaces. You lose!");
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }
    }
}
