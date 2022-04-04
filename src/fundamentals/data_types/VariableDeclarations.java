package fundamentals.data_types;

public class VariableDeclarations {
    //1. Variable declaration.
    static int numberOfStudents;
    //2. Variable declaration + initialization.
    static int age = 18;

    public static void main(String[] args) {
        System.out.println(numberOfStudents); //1. Prints 0 (default value).
        System.out.println(age); //2. Prints 18.
    }
}