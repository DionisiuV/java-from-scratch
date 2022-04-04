package advanced_features.abstract_classes;

public class AbstractClass {
    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        //myApp.signIn();
        //myApp.displayMessage();
        //myApp.signOut(); //Not recommended.
        //MyApp.signOut();

        //new GoogleAuth(); //Produces a compilation error.

        GoogleAuth auth = new MyApp();
        //auth.displayMessage();
        //auth.signIn();
        //auth.signOut(); //Not recommended.
        GoogleAuth.signOut();
    }
}

abstract class GoogleAuth {
    //Concrete method
    public void displayMessage() {
        System.out.println("Please sign-in.");
    }

    //Abstract method
    public abstract void signIn();

    //Static method
    public static void signOut() {
        System.out.println("Signing out...");
    }
}

class MyApp extends GoogleAuth {
    @Override
    public void signIn() {
        System.out.println("Signing in to Google...");
    }
}