package SS4_Classes_and_Objects_in_Java.Practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle: "+ rectangle.display());
        System.out.println("Area rectangle: "+ rectangle.getArea());
        System.out.println("Perimeter rectangle: "+rectangle.getPerimeter());
    }

    double width, height;

    public Rectangle(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
