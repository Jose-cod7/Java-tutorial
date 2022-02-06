package chapter6;

/*
* Write a class that creates instances of the rectangle class to find the
* total area of two rooms in a house.
*/
public class HomeAreaCalculator {

    public static void main(String args []) {

        /************
         * AREA RECTANGLE 1
         ***********/

        //Create instance of rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /************
         * AREA RECTANGLE 2
         ***********/

        //Create instance of rectangle class
        Rectangle room2 = new Rectangle(30, 75);
       double areaOfRoom2 = room2.calculateArea();

       double totalArea = areaOfRoom1 + areaOfRoom2;

       System.out.println("The area of both rooms are: " + totalArea + "m²");

        /************
         * PERIMETER RECTANGLE 1
         ***********/

        System.out.println("Room 1 => length: " + room1.getLength() + " width: " +room1.getWidth());
        double perimeterRoom1 = room1.calculatePerimeter();
        System.out.println("this is the perimeter: " + perimeterRoom1);

        /************
         * PERIMETER RECTANGLE 2
         ***********/

        System.out.println("Room 2 => length: " + room2.getLength() + " width: " +room2.getWidth());
        double perimeterRoom2 = room2.calculatePerimeter();
        System.out.println("this is the perimeter: " + perimeterRoom2);

    }
}
