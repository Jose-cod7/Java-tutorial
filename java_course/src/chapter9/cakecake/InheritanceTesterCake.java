package chapter9.cakecake;

public class InheritanceTesterCake {

    public static void main(String args[]){

        Cake cake = new Cake("Strawberry");
        System.out.println("Cake Flavor: " + cake.getFlavor() + " Price: " + cake.getPrice());


        BirthdayCake birthdayCake = new BirthdayCake();
        //birthdayCake.setFlavor("chocolate");
        birthdayCake.setPrice(82.60);
        System.out.println("BDAY cake: Flavor: " + birthdayCake.getFlavor() + " Price: " + birthdayCake.getPrice());

        WeedingCake weedingCake = new WeedingCake();
        weedingCake.setPrice(149.99);
        System.out.println("Weeding Cake Flavor: " + weedingCake.getFlavor() + " Price: " + weedingCake.getPrice());

    }
}
