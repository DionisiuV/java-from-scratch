package exercises.certificates;

import java.util.Arrays;
import java.util.stream.Stream;

//What's the output?
public class Ex13 {
    public static void main(String[] args) {
        Integer[] numbers = {
                1, 2, 3, 4, 5,
                5, 4, 3, 2, 1,
                1, 2, 3, 4, 5,
        };
        Stream<Integer> stream = Arrays.stream(numbers);
        long count = stream.distinct().parallel().peek(System.out::println).count();
        System.out.println(count);
    }
}
//Timi: 5
//Rafa: 5
//Razvan: 5
//Gabriel: 5 1
//Valentin: 5 1