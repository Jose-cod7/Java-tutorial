package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String args[]){

        //Initialize values we know

        double value10Cents = 0.10;
        double value25Cents = 0.25;
        double value50Cents = 0.50;
        double euro = 1.00;

        //Get the different coins

        System.out.println("Enter the amount of 25 cents coins:");
        Scanner scanner = new Scanner(System.in);
        int amount25CentsCoins = scanner.nextInt();
        double total25Coins = amount25CentsCoins * value25Cents;

        System.out.println("Enter the amount of 10 cents coins:");
        int amount10CentsCoins = scanner.nextInt();
        double total10Coins = amount10CentsCoins * value10Cents;

        System.out.println("Enter the amount of 50 cents coins:");
        int amount50CentsCoins = scanner.nextInt();
        double total50Coins = amount50CentsCoins * value50Cents;
        scanner.close();

        double totalCents = total25Coins + total50Coins + total10Coins;

        System.out.println("the total is: " + "€" + totalCents );

        //Make the decision on the path - output

        if (totalCents == euro) {
            System.out.println("Congrats! it's exactly €1 you won");
        }
        else if (totalCents > euro) {
            double amountOver = totalCents - euro;
            System.out.println("You lose, You were over €" + String.format("%.2f", amountOver) + " cents");
        }
        else {
            double amountShort = euro - totalCents;
            System.out.println("You lose, You were short €" + String.format("%.2f", amountShort) + " cents");
        }

    }
}
