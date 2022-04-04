package exercises.certificates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

//What's the output?
public class Ex15 {
    public static void main(String[] args) {
        Integer two = 2;
        List<Integer> twos = new ArrayList<>();
        twos.add(two);
        twos.add(two);
        twos.add(two);
        int ans = twos.parallelStream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                System.out.println( a + " " + b);
                return a / b;
            }
        });
        System.out.println(ans);
    }
}
//Timi: X
//Rafa: 1
//Razvan: 1
//Gabriel: 1
//Valentin: X