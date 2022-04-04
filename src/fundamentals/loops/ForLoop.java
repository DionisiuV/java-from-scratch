package fundamentals.loops;

public class ForLoop {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            System.out.print(x + " ");
        }

        System.out.println();

        for (int x = 4; x >= 0; x--) {
            System.out.print(x + " ");
        }

        System.out.println();

//        for ( ; ; ) {
//            System.out.println("Infinite loop...");
//        }
    }
}