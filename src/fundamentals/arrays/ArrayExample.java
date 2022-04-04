package fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] years = new int[5];
        years[0] = 1996;
        years[1] = 2011;
        years[2] = 2014;
        years[3] = 2018;
        years[4] = 2021;
        //System.out.println(years);
        for (int i = 0; i < years.length; i++) {
            //System.out.println((char)years[i]);
        }
        for (int year : years) {
            //System.out.println(year);
        }
        //System.out.println(Arrays.toString(years));

        //String name = "Alex";
        //int nameLength = name.length();
        //System.out.println(nameLength);

        int firstYear = years[0];
        //System.out.println(firstYear);
        int lastYear = years[years.length - 1];
        //System.out.println(lastYear);

        int[] integers = new int[] {(int)5.11, 3, 15, 25, 44, 88, Integer.parseInt("99")};
        //System.out.println(integers.length);
        //System.out.println(integers[0]);
        //System.out.println(integers[integers.length - 1]);

        //Object[] objects = {new String("Alex"), new Integer(11), new StringBuilder("xyz")};
        Object[] objects = {"Alex", 11, new StringBuilder("xyz"), new Scanner(System.in)};
        for (Object obj : objects) {
            //System.out.println(obj);
        }

        int[][] byArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8}
        };
    }
}