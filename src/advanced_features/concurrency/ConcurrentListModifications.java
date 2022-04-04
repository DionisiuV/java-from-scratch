package advanced_features.concurrency;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListModifications {
    static List<String> countries = Arrays.asList("Germany", "France", "UK");
    static List<String> cities = new CopyOnWriteArrayList<>() {{
        this.add("London"); //this is no necessary.
        add("Manchester");
        add("Liverpool");
    }};

    public static void main(String[] args) {
        String countryToRemove = "UK";
        //removeCountryUsingIterator(countryToRemove);
        //removeCountryUsingForEachLoop(countryToRemove);
        //removeCountryUsingStream(countryToRemove);
        //removeCountryUsingRafaSolution(countryToRemove);

        String cityToRemove = "Liverpool";
        removeCity(cityToRemove);
        System.out.println(cities);
    }

    private static void removeCountryUsingIterator(String countryToRemove) {
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            if (country.equals(countryToRemove)) {
                countries.remove(countryToRemove);
            }
        }
    }

    private static void removeCountryUsingForEachLoop(String countryToRemove) {
        for (String country : countries) {
            if (country.equals(countryToRemove)) {
                countries.remove(countryToRemove);
            }
        }
    }

    private static void removeCountryUsingStream(String countryToRemove) {
        countries.stream()
                .filter(country -> country.equals(countryToRemove))
                .forEach(country -> countries.remove(countryToRemove));
    }

    private static void removeCountryUsingRafaSolution(String countryToRemove) {
        countries.removeIf(c -> c.equals(countryToRemove));
    }

    private static void removeCity(String cityToRemove) {
        cities.removeIf(c -> c.equals(cityToRemove));
    }
}