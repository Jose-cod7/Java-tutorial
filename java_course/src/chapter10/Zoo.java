package chapter10;

public class Zoo {

    public static void main(String args[]) {

        Animal something = new Animal();
        something.makeSound();

        Dog bruce = new Dog();
        bruce.makeSound();
        feed(bruce);

        Animal lola = new Dog();
        lola.makeSound();

        lola = new Cat();
        lola.makeSound();
        ((Cat) lola).scratch();
        feed(lola);
    }

    public static void feed(Animal animal) {
        if(animal instanceof Dog) {
            System.out.println("Here is your dog food!");
        }
        else if(animal instanceof Cat) {
            System.out.println("Here is your tuna yummii!");
        }
    }
}
