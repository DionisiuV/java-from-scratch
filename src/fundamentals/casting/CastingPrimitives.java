package fundamentals.casting;

public class CastingPrimitives {
    public static void main(String[] args) {
        //Widening
        //byte b = 1;
        //double d = (byte) b; //Not necessary
        //System.out.println(d);

        //Narrowing
        double d = 1.25;
        byte b = (byte) d; //Mandatory
        System.out.println(b);
    }
}