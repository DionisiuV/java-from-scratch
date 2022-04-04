package exercises.projects.ex3.data;

import exercises.projects.ex3.GmailWebsite;

public class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void openGmailWebsite() {
        GmailWebsite gmailWebsite = new GmailWebsite();
        gmailWebsite.inputCredentials();
        gmailWebsite.signInButtonClick();
    }
}