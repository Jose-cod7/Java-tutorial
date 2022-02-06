package chapter10;

public class Orange extends Fruit{

    public Orange() {
        //super(); We must use super(), only if we made an inherited constructor in fruits
        setCalories(34);
        System.out.println("This is orange default constructor");
    }

    public void removeSeeds() {
        System.out.println("Seeds removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Orange juice is made");
    }
}
