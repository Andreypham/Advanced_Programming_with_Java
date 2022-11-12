package SS7_Abstract_Class_And_Interface.Exercise;

import java.util.concurrent.ThreadLocalRandom;

public class GeometricResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(4);

        System.out.println(circle.toString());
        circle.resize(75);
        System.out.println(rectangle.toString());
        rectangle.resize(50);
        System.out.println(square.toString());
        square.resize(25);
    }
}