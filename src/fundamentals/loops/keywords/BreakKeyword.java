package fundamentals.loops.keywords;

public class BreakKeyword {
    public static void main(String[] args) {
        int number = 5;

        //Breaks the iteration when i == 2.
        for (int i = 0; i < number; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Bye!"); //It's triggered.

        //Breaks the inner iteration at i == 2.
        for (int i = 0; i < number; i++) {
            //Inner loop
            for (int j = 0; j < number; j++) {
                if (i == 2) {
                    break;
                }
                //System.out.println("i: " + i + ", j: " + j);
            }
        }

        //Breaks the inner iteration at j == 2.
        for (int i = 0; i < number; i++) {
            //Inner loop
            for (int j = 0; j < number; j++) {
                if (j == 2) {
                    break;
                }
                //System.out.println("i: " + i + ", j: " + j);
            }
        }

        for (int i = 0; i < number; i++) {
            //Inner loop
            for (int j = 0; j < number; j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                //System.out.println("i: " + i + ", j: " + j);
            }
        }

        outer: for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 2) {
                    break outer;
                }
                //System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}