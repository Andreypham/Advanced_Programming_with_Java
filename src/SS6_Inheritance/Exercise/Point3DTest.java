package SS6_Inheritance.Exercise;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(3, 4, 5);
        point3D.setX(8);
        point3D.setY(9);
        point3D.setZ(10);
        System.out.println(point3D);
        point3D.setXYZ(15, 20, 30);
        System.out.println(point3D);
    }
}
