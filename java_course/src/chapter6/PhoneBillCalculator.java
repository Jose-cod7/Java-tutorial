package chapter6;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class PhoneBillCalculator {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        PhoneBill phoneBill = new PhoneBill();
        phoneBill.setId(43);
        phoneBill.setBaseCost(77.81);
        phoneBill.setMinutesUsed(80);
        phoneBill.setAssignedMinutes(70);
        phoneBill.printItemizedBill();


        //Another approach get the values from the terminal:

        PhoneBillCalculator calculator = new PhoneBillCalculator();

         PhoneBill pepephone = calculator.getBillData();

         double total = calculator.calculateTotalBill(pepephone);

        System.out.println("Total : " + String.format("%.2f", total));
        calculator.printBill(pepephone);

        calculator.scanner.close();
    }

    public PhoneBill getBillData(){
        System.out.println("Enter the ID: ");
        int id = scanner.nextInt();

        System.out.println("Enter the base cost: ");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter assigned minutes: ");
        int assignedMinutes = scanner.nextInt();

        System.out.println("Enter minutes used: ");
        int minutesUsed = scanner.nextInt();

        return new PhoneBill(id, baseCost, assignedMinutes, minutesUsed);
    }

    public double calculateTotalBill(PhoneBill pepephone) {
        return pepephone.calculateTotal();
    }

    public void printBill(PhoneBill pepephone) {
        System.out.println(pepephone.printItemizedBill());
    }
}
