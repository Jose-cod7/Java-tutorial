package chapter9;

public class InheritanceTesterRectangle {

    public static void main(String args[]){
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("Donut (square)");
        testSquareOverride();
    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println("Square perimeter: " + square. calculatePerimeter());




    }
}
