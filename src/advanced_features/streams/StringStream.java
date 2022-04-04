package advanced_features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Moon");
        planets.add("Mars");
        planets.add("Jupiter");
        //planets.stream().sorted().forEach(System.out::println);
        //planets.stream().filter(s -> s.startsWith("M")).forEach(System.out::println);

        //List<String> filteredList = planets.stream().filter(s -> s.startsWith("M")).sorted().collect(Collectors.toList());
        List<String> filteredList = planets.stream()
                .filter(s -> s.startsWith("M"))
                .sorted()
                .toList();
        //filteredList.forEach(System.out::println);

        boolean allPlanetsAreGreaterThanThree = planets.stream().allMatch(s -> s.length() > 6);
        System.out.println(allPlanetsAreGreaterThanThree);
    }
}