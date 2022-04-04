package fundamentals.formatting;

import fundamentals.static_concept.Sys;

import java.util.Locale;

public class PrintF {
    public static void main(String[] args) {
        //System.out.printf("%s %s", "Hello,", "World!");
        //System.out.printf("%s %s", "Give me", 5);
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        //System.out.printf("%d %d %d %d", b, s, i, l);
        char c = 'c';
        //System.out.printf("%c", c);
        double d = 5.00;
        //System.out.printf("%s%f", "Give me $", d);
        //System.out.printf("%s %b", "This is", true);
        System.out.printf(Locale.US, "%,d \n", 10_000_000);
        System.out.printf(Locale.ITALY, "%,d \n", 10_000_000);
        //It is the same thing.
       // System.out.format("%s %s", "Hello,", "World!");
    }
}