package exercises.certificates;

import java.util.stream.IntStream;

//What's the output at L1, L2 and L3?
public class Ex20 {
    public static void main(String[] args) {
        int m1 = IntStream.rangeClosed(1, 3).max().getAsInt();
        long m2 = IntStream.range(1, 4).count();
        System.out.println(m1 + ":" + m2); //L1
        System.out.println(m1 + "+" + m2); //L2
        System.out.println(m1 + '-' + m2); //L3
    }
}
//Timi: L1 -> 3:4, L2 -> 3+4, L3 -> 3-4
//Rafa: L1 -> 3:3, L2 -> 3+3, L3 -> 3-3
//Razvan: L1 -> 3:3, L2 -> 3+3, L3 -> 3-3
//Gabriel: L1 -> 3:4, L2 -> 3+4, L3 -> 3-4
//Valentin: L1 -> 3:4, L2 -> 3+4, L3 -> 3-4