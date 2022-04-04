package fundamentals.variables;

public class Enumeration {
    String name, country, city;

    public static void main(String[] args) {
        new Declaration();
    }
}

class Declaration {
    int i = 3, j, k = 5;

    public Declaration() {
        System.out.println("i = " + i + "\n" + "j = " + j + "\n" + "k = " + k);
    }
}