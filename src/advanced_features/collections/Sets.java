package advanced_features.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        planets.add("Moon");
        planets.add("Mars");
        planets.add("Jupiter");
        //printElements(planets);

        boolean exists = planets.add("Moon");
        //System.out.println(exists);
        //printElements(planets);

        //Useful
        planets.add("Pluto");
        //printElements(planets);
        planets.remove("Pluto");
        printElements(planets);
    }

    //We'll use it any time we do a change in the set.
    private static void printElements(Set<String> planets) {
        for (String planet : planets) {
            System.out.println(planet);
        }
    }
}