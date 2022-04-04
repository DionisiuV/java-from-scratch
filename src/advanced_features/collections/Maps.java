package advanced_features.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> planets = new HashMap<>();
        planets.put("Moon", 384_000);
        planets.put("Mars", 394_920_000);
        planets.put("Jupiter", 646_770_000);
        //printEntries(planets);

        planets.remove("Mars");
        printEntries(planets);
        System.out.println(planets.size());
    }

    private static void printEntries(Map<String, Integer> planets) {
        for (Map.Entry<String, Integer> entry : planets.entrySet()) {
            String name = entry.getKey();
            Integer distanceToEarthInKm = entry.getValue();
            System.out.printf("%s -> %s\n", name, distanceToEarthInKm);
        }
    }
}