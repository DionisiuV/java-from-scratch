package fundamentals.varargs.exercises;

public class Ex1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(multiply(11));
        System.out.println(multiply(11, 22));
        System.out.println(multiply(numbers));

        int[][] biArray = {
                {1, 2, 3, 4, 5},
                {4, 8, 9},
                {3, 5, 11, 14}
        };
        String total = multiply("Alex", biArray);
        System.out.println(total);
    }

    static long multiply(int... numbers) {
        long total = 1;
        for (int number : numbers) {
            total *= number;
        }
        return total;
    }

    static String multiply(String name, int[]... arrays) {
        long total = 1;
        for (int[] array : arrays) {
            for (int number : array) {
                total *= number;
            }
        }
        return name + ": " + total;
    }
}