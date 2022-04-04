package fundamentals.data_types;

public class PrimitiveTypes {
    //1. Primitive declarations and initializations.
    static byte b = 1;
    static short s = 100;
    static int i = 1000;
    static long l = 1_000_000;
    static float f = 1.11f;
    static double d = 2.22; //Not necessary to add a d.
    static char c = 'A';
    static boolean bool;
    static boolean isAdmin = true;
    static int minimumNumberOfStudentsInHarvardUniversityClass = 20;
    public static final double PI = 3.14;

    public static void main(String[] args) {
        //System.out.println(d);
        //System.out.println(c);
        //System.out.println(bool);
        c = 'D';
        //System.out.println(c);
        //PI = 3.15;
    }
}