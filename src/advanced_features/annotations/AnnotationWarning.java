package advanced_features.annotations;

import java.util.ArrayList;
import java.util.List;

//@SuppressWarnings("unchecked")
public class AnnotationWarning {
    //Being final it doesn't mean we cann add element to the list. It means that it cannot be reassigned.
    //To solve the issue,we need to change List -> List<String>. The warning will be gone.
    private static final List<String> planetList = new ArrayList<>();

    public static void main(String[] args) {
        addPlanetToList("Mars");
        System.out.println(planetList);
        addPlanetToOurList("Pluto");
        System.out.println(planetList);
    }

    //@SuppressWarnings("unchecked")
    public static void addPlanetToList(String planet) {
        planetList.add(planet);
    }

    //@SuppressWarnings("unchecked")
    public static void addPlanetToOurList(String planet) {
        planetList.add(planet);
    }
}