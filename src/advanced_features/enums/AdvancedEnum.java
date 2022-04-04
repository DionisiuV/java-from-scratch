package advanced_features.enums;

public class AdvancedEnum {
    public static void main(String[] args) {
        //Planet planet = new Planet(); //Compilation Error.

        int distanceToEarthInMeter = Planet.MOON.convertDistanceToEarthInMeter();
        //System.out.println(distanceToEarthInMeter);

        for (Planet planet : Planet.values()) {
            System.out.println(planet.convertDistanceToEarthInMeter());
        }
    }
}

enum Planet {
    MOON("Moon", 384_000),
    MARS("Mars", 394_920_000),
    JUPITER("Jupiter", 646_770_000);

    String name;
    int distanceToEarthInKm;

    Planet(String name, int distanceToEarthInKm) {
        this.name = name;
        this.distanceToEarthInKm = distanceToEarthInKm;
    }

    int convertDistanceToEarthInMeter() {
        return distanceToEarthInKm * 1_000;
    }
}