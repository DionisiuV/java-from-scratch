package fundamentals.loops.keywords;

public class SystemExit {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 5};

//        for (int i : integers) {
//            System.out.println(i);
//            System.exit(-1);
//        }
//        System.out.println("Bye!");

        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (i == 2) {
                    System.exit(-1);
                }
                System.out.println("i: " + i + ", j: " + j);
            }
            System.out.println();
        }
    }
}