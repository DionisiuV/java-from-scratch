package advanced_features.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import static java.lang.System.*;

public class Lists {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Moon");
        planets.add("Mars");
        planets.add("Jupiter");
        //printElements(planets);

        //Useful methods.
        planets.add(1, "Pluto");
        //printElements(planets);
        planets.remove("Pluto");
        //printElements(planets);

        //System.out.println(planets.get(0)); //Get the elements at a specific index.
        //System.out.println(planets.indexOf("Moon")); //Get the index of a specific element.

        //Solution to print the content of a list.
        //System.out.println(planets);

        //Solution to sort the list.
        Collections.sort(planets);
        //printElements(planets);

        //List of Planet objects.
        List<Planet> planetList = new ArrayList<>();
        planetList.add(new Planet("Moon", 384_000));
        planetList.add(new Planet("Mars", 394_920_000));
        planetList.add(new Planet("Jupiter", 646_770_000));
        //printPlanets(planetList);
        //printPlanetList(planetList);

        //planets.forEach(out::println);
    }

    //We'll use it any time we do a change in the list.
    private static void printElements(List<String> planets) {
        for (String planet : planets) {
            out.println(planet);
        }
    }

    //Doesn't need to be generic.
    private static void printAllElements(List<String> planets) {
        //
    }

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        //
    }

    private static void printPlanets(List<Planet> planetList) {
        for (Planet planet : planetList) {
            out.println(planet.name + " -> " + planet.distanceToEarthInKm);
        }
    }

    private static void printPlanetList(List<Planet> planetList) {
        Iterator<Planet> iterator = planetList.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next()); //Will print the memory address.
            //Planet p = iterator.next();
            //System.out.println(p.getName() + " -> " + p.getDistanceToEarthInKm());
            //System.out.println(iterator.next());
        }
    }
}

class Planet {
    String name;
    int distanceToEarthInKm;

    public Planet(String name, int distanceToEarthInKm) {
        this.name = name;
        this.distanceToEarthInKm = distanceToEarthInKm;
    }

    public String getName() {
        return name;
    }

    public int getDistanceToEarthInKm() {
        return distanceToEarthInKm;
    }

    @Override
    public String toString() {
        return name + " -> " + distanceToEarthInKm;
    }
}

class Mars extends Planet {
    public Mars(String name, int distanceToEarthInKm) {
        super(name, distanceToEarthInKm);
    }
}