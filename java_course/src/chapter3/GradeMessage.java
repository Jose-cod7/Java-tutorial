package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to wirk a bit harder";
                break;
            case "E":
                message = "Uh oh!";
                break;
            default:
                message = "Error, Invalid grade";
        }

        System.out.println(message);
    }
}
