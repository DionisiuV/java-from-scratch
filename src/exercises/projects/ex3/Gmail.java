package exercises.projects.ex3;

import exercises.projects.ex3.data.User;

//How to simulate a Gmail authentication using given credentials? Use an interface callback for success and failure.
//Email: john@gmail.com
//Pass: 123456
public class Gmail {
    public static void main(String[] args) {
        User john = new User("John", 30);
        john.openGmailWebsite();
    }
}