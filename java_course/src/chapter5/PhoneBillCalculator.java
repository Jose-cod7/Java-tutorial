package chapter5;

/*
* PHONE BILL CALCULATOR
* Calculate the final total of someone's cell phone bill.
* Allow the operator to input the plan fee and the number of overage minutes.
* Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
* Create separate methods to calculate the tax, overage fees, and final total.
* Print the itemized bill.
 */

import java.util.Scanner;

import static chapter5.PhoneBillCalculator.calculateAndPrintBill;

public class PhoneBillCalculator {

    // Initialize what we know

    static double taxFee = 0.15;
    static double overageFee = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        //get what we don't know
        double basePlan = getBasePlan();
       int overageMinutes = getOverageMinutes();
        scanner.close();

        //Calculate tax, overage fees, and final total

        double totalOverageMinutes = calculateOverageFees(overageMinutes);
        double taxTotal = calculateTax(basePlan, totalOverageMinutes);
         calculateAndPrintBill(basePlan, totalOverageMinutes, taxTotal);

    }

    public static double getBasePlan() {
        System.out.println("Enter base cost of the plan:");
        double basePlan = scanner.nextDouble();
        return basePlan;
    }

    public static int getOverageMinutes() {
        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }

    public static double calculateOverageFees(double overageMinutes){
       double totalOverageMinutes = overageMinutes * overageFee;
        return  totalOverageMinutes;
    }

    public static double calculateTax(double basePlan, double totalOverageMinutes) {
        double basePlanTotalFee = (basePlan + totalOverageMinutes) * taxFee;
        return basePlanTotalFee;
    }

    public static void calculateAndPrintBill(double basePlan, double totalOverageMinutes, double taxTotal) {
        double finalTotal = basePlan + totalOverageMinutes + taxTotal;
        //Print the bill
        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: " + String.format("%.2f", basePlan));
        System.out.println("Overage: " + String.format("%.2f", totalOverageMinutes));
        System.out.println("Tax: " + String.format("%.2f", taxTotal));
        System.out.println("Total: " + String.format("%.2f", finalTotal));

    }

}
