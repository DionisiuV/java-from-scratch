package advanced_features.concurrency;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapModifications {
    static Map<String, String> capitals = new HashMap<>() {{
        put("Berlin", "Germany");
        put("Paris", "France");
        put("London", "UK");
    }};
    static Map<String, String> nonCapitals = new ConcurrentHashMap<>() {{
        put("Hamburg", "Germany");
        put("Lion", "France");
        put("Liverpool", "UK");
    }};

    public static void main(String[] args) {
        String capitalToRemove = "London";
        //removeCapitalUsingIterator(capitalToRemove);
        //removeCapitalUsingStream(capitalToRemove);
        //removeCapitalUsingKeySet(capitalToRemove);
        //removeCapitalUsingForEach(capitalToRemove);

        String nonCapitalToRemove = "Liverpool";
        removeNonCapital(nonCapitalToRemove);
        System.out.println(nonCapitals);
    }

    private static void removeCapitalUsingIterator(String capitalToRemove) {
        Iterator<Map.Entry<String, String>> iterator = capitals.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String capital = entry.getKey();
            if (capital.equals(capitalToRemove)) {
                capitals.remove(capitalToRemove);
            }
        }
    }

    private static void removeCapitalUsingStream(String capitalToRemove) {
        capitals.entrySet().stream()
                .filter(e -> e.getKey().equals(capitalToRemove))
                .forEach(e -> capitals.remove(capitalToRemove));
    }

    private static void removeCapitalUsingKeySet(String capitalToRemove) {
        capitals.keySet().stream()
                .filter(c -> c.equals(capitalToRemove))
                .forEach(c -> capitals.remove(capitalToRemove));
    }

    private static void removeCapitalUsingForEach(String capitalToRemove) {
        capitals.forEach((key, value) -> {
            if (key.equals(capitalToRemove)) {
                capitals.remove(capitalToRemove);
            }
        });
    }

    private static void removeNonCapital(String capitalToRemove) {
        nonCapitals.forEach((key, value) -> {
            if (key.equals(capitalToRemove)) {
                nonCapitals.remove(capitalToRemove);
            }
        });
    }
}