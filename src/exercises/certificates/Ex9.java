package exercises.certificates;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

//What's the output?
public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        Instant loginTime = Instant.now(); //2022-01-19T13:14:42.147635800Z
        Thread.sleep(1_000);
        Instant logoutTime = Instant.now(); //2022-01-19T13:14:43.160222900Z

        loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);
        logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);

        if (logoutTime.isAfter(loginTime)) {
            System.out.println("Logged out at: " + logoutTime);
        } else {
            System.out.println("Can't logout.");
        }
    }
}
//Timi: logoutTime
//Rafa: Can't logout.
//Razvan: Can't logout.
//Gabriel: Can't logout.
//Valentin: logoutTime