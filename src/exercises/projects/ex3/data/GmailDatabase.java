package exercises.projects.ex3.data;

import java.util.Arrays;
import java.util.List;

public class GmailDatabase {
    private static final List<Credentials> gmailCredentials = Arrays.asList(
            new Credentials("john@gmail.com", "123456"),
            new Credentials("mark@gmail.com", "654321"),
            new Credentials("paul@gmail.com", "123654"),
            new Credentials("anna@gmail.com", "654123")
    );

    public static List<Credentials> getGmailCredentials() {
        return gmailCredentials;
    }
}