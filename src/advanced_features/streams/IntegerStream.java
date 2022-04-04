package advanced_features.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerStream {
    public static void main(String[] args) {
        int[] integers = {11, 22, 33, 44};
        IntStream intStream = Arrays.stream(integers);
        long numberOfElements = intStream.count();
        System.out.println(numberOfElements);
    }
}