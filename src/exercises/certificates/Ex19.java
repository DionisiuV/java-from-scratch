package exercises.certificates;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

//What's the output?
public class Ex19 {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(0);
        Stream<String> ask = Stream.of("Want", "to", "pass").parallel();
        ask.filter(w -> {
            ai.incrementAndGet();
            return w.contains("to");
        }).distinct().parallel();
        System.out.println(ai);
    }
}
//Timi: 0
//Rafa: 1 2 random
//Razvan: 2
//Gabriel: 1 - 3 random
//Valentin: X