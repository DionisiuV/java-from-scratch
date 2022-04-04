package fundamentals.date_time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {
    public static void main(String[] args) {
        //printFormattedDate("d.M.yy HH:mm:ss"); // 1.1.21 11:30:26
        //printFormattedDate("dd.M.yy HH:mm:ss"); //01.1.21 11:30:26
        //printFormattedDate("dd.MM.yy HH:mm:ss"); //01.01.21 11:30:26
        //printFormattedDate("dd.MMM.yy HH:mm:ss"); //01.Jan.21 11:30:26
        //printFormattedDate("dd.MMMM.yy HH:mm:ss"); //01.January.21 11:30:26
        //printFormattedDate("dd.MMMM.yyyy HH:mm:ss"); //01.January.2021 11:30:26 <- No confusion
        //printFormattedDate("dd.MMM.yyyy HH:mm:ss"); //01.Jan.2021 11:30:26 <- No confusion
        //printFormattedDate("dd.MMM.yyyy HH:mm:ss.SSS"); //01.Jan.2021 11:30:26.230

        printFormattedDateAccordingToLocale("dd.MMMM.yyyy HH:mm:ss", Locale.ITALIAN);
        printFormattedDateAccordingToLocale("dd.MMMM.yyyy HH:mm:ss", Locale.FRENCH);
    }

    static void printFormattedDate(String pattern) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String formattedDate = simpleDateFormat.format(now);
        System.out.println(formattedDate);
    }

    static void printFormattedDateAccordingToLocale(String pattern, Locale locale) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
        String formattedDate = simpleDateFormat.format(now);
        System.out.println(formattedDate);
    }
}