package exercises.projects.ex3.data;

import java.util.Arrays;
import java.util.List;

public class GmailResponse {
    public String message;
    public List<Email> emails = Arrays.asList(
            new Email("mark@gmail.com", "john@gmail.com", "Hi!", "How are you?"),
            new Email("paul@gmail.com", "john@gmail.com", "Hey!", "Who are you?"),
            new Email("anna@gmail.com", "john@gmail.com", "Hello!", "Where are you?")
    );

    public GmailResponse(String message) {
        this.message = message;
    }
}