package SS6_Inheritance.Exercise;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = getZ();
        return array;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D (" + getX() + ";" + getY() + ":" + getZ() + ")";
    }
}
