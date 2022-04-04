package advanced_features.lambda_expression;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("This is the implementation of run() method.");
        //runnable.run();

        Predicate<String> startWith = s -> s.startsWith("J");
        //System.out.println(startWith.test("Java"));

        Function<String, Integer> length = s -> s.length();
        //System.out.println(length.apply("Java"));

        Function<String, String> replaceCommasWithDots = s -> s.replace(',', '.');
        //System.out.println(replaceCommasWithDots.apply("1,000,000,000"));

         Supplier<Integer> randomNumber = () -> new Random().nextInt();
        //System.out.println(randomNumber.get());

        //Multiple lines of code.
        UnaryOperator<Integer> toSquare = i -> {
            int square = i * i;
            System.out.println(square);
            return square;
        };
        System.out.println(toSquare.apply(5));
    }
}