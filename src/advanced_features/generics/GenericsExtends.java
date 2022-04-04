package advanced_features.generics;

public class GenericsExtends {
    public static void main(String[] args) {
        GoogleAuth googleAuth = new GoogleAuth();
        MyApp<GoogleAuth> myApp = new MyApp<>(googleAuth);
        myApp.signInWith();

        Auth auth = new FacebookAuth();
        MyApp<Auth> app = new MyApp<>(auth);
        app.signInWith();
    }
}

@FunctionalInterface
interface Auth {
    void signIn();
}

class GoogleAuth implements Auth {
    @Override
    public void signIn() {
        System.out.println("Signing in with Google...");
    }
}

class FacebookAuth implements Auth {
    @Override
    public void signIn() {
        System.out.println("Signing in with Facebook...");
    }
}

class MyApp<T extends Auth> {
    private T auth;

    public MyApp(T auth) {
        this.auth = auth;
    }

    public void signInWith() {
        auth.signIn();
    }
}