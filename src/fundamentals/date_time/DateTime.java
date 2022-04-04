package fundamentals.date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) throws ParseException {
        String birthday = "15-09-2000";
        //System.out.println(birthday);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date birthdayDate = dateFormat.parse(birthday);
        //System.out.println(birthdayDate);

        Date now = new Date();
        //System.out.println(now);
        //Or
        long millis = System.currentTimeMillis();
        //System.out.println(millis);
        Date millisDate = new Date(millis);
        //System.out.println(millisDate);

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        //System.out.println(date);

        calendar.setTime(birthdayDate); //Convert a Date object to a Calendar object.
        //Useful methods.
        //System.out.println(calendar.get(Calendar.YEAR));
        //System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));

        LocalDateTime localNow = LocalDateTime.now();
        //System.out.println(localNow);
        LocalDateTime customLocale = LocalDateTime.of(2021, Month.DECEMBER, 7, 21, 35);
        //System.out.println(customLocale);
        LocalDateTime dateTime = LocalDateTime.parse("2021-12-07T21:35");
        //System.out.println(dateTime);
        //Useful methods
        LocalDateTime tomorrow = localNow.plusDays(1);
        //System.out.println(tomorrow);
        LocalDateTime twoHoursAgo = localNow.minusHours(2);
        //System.out.println(twoHoursAgo);
        Month december = localNow.getMonth();
        System.out.println(december);
    }
}