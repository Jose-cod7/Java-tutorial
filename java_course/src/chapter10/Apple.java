package chapter10;

public class Apple extends Fruit {

    public Apple() {
        //super(); We must use super(), only if we made an inherited constructor in fruits
        setCalories(53);
        System.out.println("This is apple default constructor");
    }

    public void smash() {
        System.out.println("smash apple");
    }


    @Override
    public void makeJuice() {
        System.out.println("Not juice, it's pure!");
    }
}
