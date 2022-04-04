package exercises.certificates;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//What's the output?
public class Ex16 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hey", "Hi", "Hello");
        BinaryOperator<String> operator = String::concat;
        String ans = words.parallelStream()
                .reduce(" Greeting: ", operator);
        System.out.println(ans);
    }
}
//Timi: Greeting: Hey, Greeting: Hi Greeting: Hello / Greeting: HeyHiHello
//Rafa: Greeting: HeyHiHello / X
//Razvan: Greeting: HeyHiHello / Greeting: Hey, Greeting: Hi Greeting: Hello
//Gabriel: Greeting: Hey, Greeting: Hi Greeting: Hello / Greeting: Hey, Greeting: Hi Greeting: Hello (Random)
//Valentin: Greeting: HeyHiHello / Greeting: Hey, Greeting: Hi Greeting: Hello