package fundamentals.variables;

public class LocalVariables {
    public static void main(String[] args) {
        print("Hello, World!");
    }

    static void print(final String message) {
        //message = "Hi, World!";
        System.out.println(message);
    }
}

class Article {
    String title;

    {
        final String content;
    }

    public Article(final String title) {
        //title = "New title";
        this.title = title;
        System.out.println(title);
    }
}