package exercises.certificates;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//What's the output?
public class Ex1 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("X");
        set.add("Y");
        set.add("x");
        set.add("y");
        set.add("X");
        Iterator<String> iterator = set.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            switch (iterator.next()) {
                case "x":
                    System.out.print("x ");
                    break;
                case "y":
                    System.out.print("y ");
                    break;
            }
            count++;
        }
        System.out.print("\ncount = " + count);
    }
}
//Timi: x y count = 2
//Rafa: x y count = 4
//Razvan: x y count = 4
//Gabriel: x y count = 4
//Valentin: x y count = 4