package fundamentals.loops.keywords;

public class ReturnKeyword {
    public static void main(String[] args) {
        int number = 5;

//        for (int i = 0; i < number; i++) {
//            if (i == 2) {
//                return;
//            }
//            System.out.println("i: " + i);
//        }
//        System.out.println("Bye!"); //It's not triggered anymore.

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 2) {
                    return;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
            System.out.println();
        }
        System.out.println("Bye!"); //It's not triggered anymore.
    }
}