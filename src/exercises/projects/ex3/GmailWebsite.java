package exercises.projects.ex3;

import exercises.projects.ex3.callbacks.OnGmailAuthCallback;
import exercises.projects.ex3.data.Credentials;
import exercises.projects.ex3.data.Email;
import exercises.projects.ex3.data.GmailResponse;
import exercises.projects.ex3.exceptions.AuthException;

import java.util.List;
import java.util.Scanner;

public class GmailWebsite implements OnGmailAuthCallback {
    String email, pass;

    public void inputCredentials() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Pass: ");
        pass = scanner.nextLine();
    }

    public void signInButtonClick() {
        signInWithEmailAndPassword(email, pass);
    }

    private void signInWithEmailAndPassword(String email, String pass) {
        try {
            Credentials credentials = new Credentials(email, pass);
            GmailServer gmailServer = new GmailServer();
            gmailServer.signInWithCredentials(credentials, this);
        } catch (AuthException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void onSuccess(GmailResponse response) {
        System.out.println(response.message);
        displayEmails(response.emails);
    }

    private void displayEmails(List<Email> emails) {
        emails.forEach(e -> System.out.println(e.from + "/" + e.to + "/" + e.subject + "/" + e.text));
    }

    @Override
    public void onFailure(AuthException e) {
        System.out.println(e.getMessage());
    }
}