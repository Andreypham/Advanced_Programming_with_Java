package SS5_Access_modifier_static_method_static_property.Exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());

        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());

    }
}
