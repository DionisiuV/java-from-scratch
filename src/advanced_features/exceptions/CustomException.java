package advanced_features.exceptions;

public class CustomException {
    public static void main(String[] args) {
        Auth auth = new Auth();
        try {
            auth.signIn("alex", "12345");
        } catch (AuthException e) {
            e.getMessage();
        }
    }
}

class AuthException extends Exception {
    public AuthException(String message) {
        super(message);
    }
}

class NewException extends AuthException {
    public NewException(String message) {
        super(message);
    }
}

class Auth {
    public void signIn(String userName, String password) throws AuthException {
        if (password.isEmpty() | password.length() < 6) {
            throw new AuthException("Incorrect password length.");
        } else {
            System.out.println("Sign in successful.");
        }
    }
}

class MyApp extends Auth {
    @Override
    public void signIn(String userName, String password) throws NewException {
        //
    }
}