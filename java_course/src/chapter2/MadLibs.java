package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]){

        //1. Get the adjective
        System.out.println("Enter an adjective about the day");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        //2. Get the season
        System.out.println("Enter the season of the year");
        String season = scanner.next();

        //3. whole number
        System.out.println("Enter the amount of cups per day");
        int amountCups = scanner.nextInt();
        scanner.close();

        //4. Display the result

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + amountCups + " cups of coffee");


    }
}
