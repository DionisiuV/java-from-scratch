public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); //Prints a message.
        /*
        System.out.println("Hey, World!");
        System.out.println("Hi, World!");
        */

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}