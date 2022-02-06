package chapter10;

public class MarketFruit {

    public static void main (String args[]) {

        Fruit something = new Fruit();
        something.makeJuice();
        System.out.println(something.getCalories());

        Apple apple = new Apple();
        apple.makeJuice();
        apple.smash();
        System.out.println("Calories: " + apple.getCalories());
        food(apple);

        Fruit orange = new Orange();
        orange.makeJuice();
        ((Orange) orange).removeSeeds();
        System.out.println("Calories: " + orange.getCalories());

        food(orange);

    }

    public static void food(Fruit fruit) {
        if(fruit instanceof Apple) {
            System.out.println("Eat your apple cake");
        }
        else if(fruit instanceof Orange) {
            System.out.println("Drink your orange juice!");
        }
    }

}
