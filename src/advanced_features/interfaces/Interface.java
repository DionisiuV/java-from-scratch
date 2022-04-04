package advanced_features.interfaces;

public class Interface {
    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        //myApp.signIn();
        //myApp.displayMessage();
        //myApp.signOut(); //Produces a compilation error.
        //MyApp.signOut(); //Produces a compilation error.

        //new GoogleAuth(); //Produces a compilation error.

        GoogleAuth auth = new MyApp();
        //auth.displayMessage();
        //auth.signIn();
        //auth.signOut(); //Produces a compilation error.
        GoogleAuth.signOut();
    }
}

@FunctionalInterface
interface GoogleAuth {
    //Default method
    default void displayMessage() {
        System.out.println("Please sign-in.");
        //sayGoodBy();
    }

    //Abstract method
    void signIn();

    //Static method
    static void signOut() {
        System.out.println("Signing out...");
    }

    private void sayGoodBy() {
        System.out.println("Good by...");
    }
}

class MyApp implements GoogleAuth {
    @Override
    public void signIn() {
        System.out.println("Signing in to Google...");
    }
}