package fundamentals.loops.keywords;

public class ContinueKeyword {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 0; i < number; i++) {
            if (i == 2) {
                continue;
            }
            //System.out.println("i: " + i);
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 2) {
                    continue;
                }
                //System.out.println("i: " + i + ", j: " + j);
            }
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j == 2) {
                    continue;
                }
                //System.out.println("i: " + i + ", j: " + j);
            }
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 2 && j == 2) {
                    continue;
                }
                //System.out.println("i: " + i + ", j: " + j);
            }
            //System.out.println();
        }

        outer: for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 2) {
                    continue outer;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
            System.out.println();
        }
    }
}