package advanced_features.lambda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionForEach {
    public static void main(String[] args) {
        List<String> planets = Arrays.asList("Moon", "Mars", "Jupiter");
//        for (String planet : planets) {
//            System.out.println(planet);
//        }

//        planets.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String planet) {
//                System.out.println(planet);
//            }
//        });

        planets.forEach(s -> System.out.println(s));
        planets.forEach(System.out::println);
    }
}