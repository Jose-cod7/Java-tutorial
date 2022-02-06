package chapter10;

public class Fruit {

    private double calories;

   /* public Fruit(int calories) {
        System.out.println("Set calories");
        setCalories(calories);
    }*/

    public void makeJuice (){
        System.out.println("Juice is made");
    }
    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }




}
