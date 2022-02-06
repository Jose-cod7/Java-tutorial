package chapter4;

/*
* NESTED LOOPS
* Find the average of each student's test scores
*/

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String args[]) {

        //Initialize what we know
        int numberOfStudents = 2;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<numberOfStudents; i++){

            double scoreTotal = 0;

            //Entry the notes of each test
            for(int j = 0; j<numberOfTests; j++) {
                System.out.println("Enter the score for test #" + (j+1));
                double score = scanner.nextDouble();
                scoreTotal = scoreTotal + score;

            }

            double average = scoreTotal / numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }
        scanner.close();
        System.out.println("Is the end!!!");
    }
}
