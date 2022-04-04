package fundamentals.static_concept;

import fundamentals.static_concept.data.Car;

import static fundamentals.static_concept.data.Car.color;

public class StaticImports {
    private static String name = "Alex";
    private static int age = 20;

    public static void main(String[] args) {
        System.out.println(name); //We can access it directly.
        System.out.println(StaticImports.name); //We can access it using the name of the class.
        System.out.println(Car.brand); //We can access it using the name of the class.
        System.out.println(color); //We can access it using an import.
    }
}