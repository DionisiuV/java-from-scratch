package advanced_features.enums;

import static advanced_features.enums.Season.*;

public class Enum {
    public static void main(String[] args) {
        Season winter = WINTER;
        //System.out.println(winter);

        String seasonMoths = switch (winter) {
            case WINTER -> "Dec, Jan, Feb";
            case SPRING -> "Mar, Apr, May";
            case SUMMER -> "Jun, Jul, Aug";
            case AUTUMN -> "Sep, Oct, Nov";
        };
        //System.out.println(seasonMoths);

        for (Season season : Season.values()) {
            //System.out.println(season);
        }

        //System.out.println(winter.getNumberOfMonths()); //We can call it using the already created object.
        //System.out.println(Season.WINTER.getNumberOfMonths()); //We can call it using the object in the enum.
        System.out.println(WINTER.getNumberOfMonths()); //We can call it directly using the correct static import.
    }
}

enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    int getNumberOfMonths() {
        return 3;
    }
}