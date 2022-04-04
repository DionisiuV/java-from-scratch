package exercises.projects.ex3;

import exercises.projects.ex3.callbacks.OnGmailAuthCallback;
import exercises.projects.ex3.data.Credentials;
import exercises.projects.ex3.data.GmailDatabase;
import exercises.projects.ex3.data.GmailResponse;
import exercises.projects.ex3.exceptions.AuthException;
import exercises.projects.ex3.exceptions.GmailAuthException;

import java.util.List;

import static exercises.projects.ex3.Messages.*;

public class GmailServer {
    boolean accessGranted = true;

    void signInWithCredentials(Credentials credentials, OnGmailAuthCallback callback) throws AuthException {
        if (accessGranted) {
            if (areCredentialsValid(credentials)) {
                callback.onSuccess(new GmailResponse(SUCCESS_MESSAGE));
            } else {
                callback.onFailure(new GmailAuthException(ERROR_MESSAGE));
            }
        } else {
            callback.onFailure(new AuthException(SERVER_MESSAGE));
        }
    }

    private boolean areCredentialsValid(Credentials credentials) {
        List<Credentials> gmailCredentials = GmailDatabase.getGmailCredentials();
        for (Credentials gmailCredential : gmailCredentials) {
            if (gmailCredential.email.equals(credentials.email) && gmailCredential.pass.equals(credentials.pass)) {
                return true;
            }
        }
        return false;
    }

    //Alternatively
    private boolean areValid(Credentials credentials) {
        List<Credentials> gmailCredentials = GmailDatabase.getGmailCredentials();
        return gmailCredentials.stream().anyMatch(c -> c.equals(credentials));
    }
}