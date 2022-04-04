package advanced_features.inheritance.exercises;

public class Ex1 {
    public static void main(String[] args) {
        ProgrammingBook programmingBook = new ProgrammingBook("Java", "Am", 25);
        ProgrammingBook pb = new ProgrammingBook();
    }
}

class Book {
    String title;
    String author;
    double price;

    void sellABook() {
        System.out.println("Selling");
    }

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class ProgrammingBook extends Book {
    void readingProgramming() {
        System.out.println("Reading programming");
    }

    public ProgrammingBook() {

    }

    public ProgrammingBook(String title, String author, double price) {
        super(title, author, price);
    }
}

class EconomicsBook extends Book {
    void learningEconomics() {
        System.out.println("Learning economics");
    }

    public EconomicsBook(String title, String author) {
        super(title, author);
    }
}