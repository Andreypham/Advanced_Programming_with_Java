package SS5_Access_modifier_static_method_static_property.Exercise;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());

        student1.setName("Khanh");
        student1.setClasses("A07");

        System.out.println(student1.getName());
        System.out.println(student1.getClasses());

    }
}
