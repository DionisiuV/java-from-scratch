package exercises.projects.ex3.callbacks;

import exercises.projects.ex3.data.GmailResponse;
import exercises.projects.ex3.exceptions.AuthException;

public interface OnGmailAuthCallback {
    void onSuccess(GmailResponse response);

    void onFailure(AuthException e);

    //void onLoading();
}