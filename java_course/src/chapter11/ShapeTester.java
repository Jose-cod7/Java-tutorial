package chapter11;

public class ShapeTester {

    public static void main(String args[]){

        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        double bathroom = rectangle.calculateArea();
        System.out.println("Area: " + rectangle.calculateArea());

        /*Shape anotherRectangle = new Rectangle(8, 4);
        double livingRoom = anotherRectangle.calculateArea();

        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Area: " + anotherRectangle.calculateArea());

        double roomsToBuild = bathroom + livingRoom;

        System.out.println("New rooms: " + roomsToBuild); */
    }

}
