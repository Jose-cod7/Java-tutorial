package chapter10;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Meeooow!!");
    }

    public void scratch() {
        System.out.println("I like to scratch things, I'm a cat");
    }
}
