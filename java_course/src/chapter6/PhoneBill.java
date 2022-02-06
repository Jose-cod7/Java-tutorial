package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int assignedMinutes;
    private int minutesUsed;

    public PhoneBill () {
         id = 0;
         baseCost = 69.80;
         assignedMinutes = 200;
         minutesUsed = 250;
    }

    public PhoneBill (int id) {
        this.id = 0;
        baseCost = 69.80;
        assignedMinutes = 200;
        minutesUsed = 250;
    }

    public PhoneBill(int id, double baseCost, int assignedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.assignedMinutes = assignedMinutes;
        this.minutesUsed = minutesUsed;
    }

    //Getter and Setter's

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost= baseCost;
    }

    public int getAssignedMinutes() {
        return assignedMinutes;
    }

    public void setAssignedMinutes(int assignedMinutes) {
        this.assignedMinutes = assignedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage() {
        if(minutesUsed <= assignedMinutes) {
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = minutesUsed - assignedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax() {
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    public String printItemizedBill() {
        System.out.println("ID " + id);
        System.out.println("Base rate: " + baseCost);
        System.out.println("Overage fee: " +  String.format("%.2f", calculateOverage()));
        System.out.println("Tax: " + String.format("%.2f", calculateTax()));
        System.out.println("Total: " + String.format("%.2f", calculateTotal()));
        return null;
    }
}
