package SS4_Classes_and_Objects_in_Java.Exercise;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.turnOn();
        fan1.setSpeedFast();
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.statusFan();

        Fan fan2 = new Fan();
        fan2.turnOff();
        fan2.setSpeedMedium();
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.statusFan();
    }

    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    int speed = SLOW;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan() {
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeedSlow() {
        this.speed = SLOW;
    }

    public void setSpeedMedium() {
        this.speed = MEDIUM;
    }

    public void setSpeedFast() {
        this.speed = FAST;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void statusFan() {
        if (this.on) {
            System.out.println("Fan is on");
            System.out.println("Speed: " + this.speed);
            System.out.println("Color: " + this.color);
            System.out.println("Radius: " + this.radius);
            System.out.println();
        } else {
            System.out.println("Fan is off");
            System.out.println("Color: " + this.color);
            System.out.println("Radius: " + this.radius);
            System.out.println();
        }
    }
}
