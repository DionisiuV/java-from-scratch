package fundamentals.static_concept;

public class Accessibility {
    private static String name = "Alex";
    private int age = 20;

    public static void main(String[] args) {
        //There is no need for an object of the class
        printStaticNameFromStaticMethod();
        printNonStaticAgeFromStaticMethod();

        Accessibility obj = new Accessibility();
        obj.printStaticNameFromNonStaticMethod();
        obj.printNonStaticAgeFromNonStaticMethod();
    }

    static void printStaticNameFromStaticMethod() {
        System.out.println(name);
    }

    void printStaticNameFromNonStaticMethod() {
        System.out.println(name);
    }

    static void printNonStaticAgeFromStaticMethod() {
        //System.out.println(age);
    }

    void printNonStaticAgeFromNonStaticMethod() {
        System.out.println(age);
    }
}