package SS7_Abstract_Class_And_Interface.Exercise;

public class Square extends Rectangle implements Resizeable, Colorable{
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side= " + getSide() +
                ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area before resizing: " + super.getArea());
        System.out.println("percent: "+ percent);
        System.out.println("Area after resizing: " + super.getArea() * (100 + percent) / 100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}