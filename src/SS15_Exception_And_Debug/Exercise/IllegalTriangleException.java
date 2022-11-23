package SS15_Exception_And_Debug.Exercise;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(double side){
        super(side + " greater than the sum of the other two sides");
    }

    public IllegalTriangleException(){
        super("Side of a triangle must be a positive double");
    }
}
