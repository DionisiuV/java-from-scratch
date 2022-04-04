package fundamentals.date_time;

import java.util.Locale;

public class LocalFormat {
    public static void main(String[] args) {
        Locale usLocale = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        //System.out.println(usLocale);

        Locale gbOne = new Locale("en");
        Locale gbTwo = new Locale("en", "GB");
        //Locale gbThree = new Locale("GB", "en"); //Incorrect!!!

        Locale frenchLocale = Locale.FRENCH;

        System.out.println("Country: " + gbOne.getDisplayCountry()); //Empty String
    }
}