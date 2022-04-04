package advanced_features.exceptions;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            //System.out.println("Exception is caught."); //Bad practice.
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        } finally {
            //System.out.println("This will printed out no matter if we get an Exception or not.");
        }

        int[] intArray = {2, 4};
        try {
            int x = intArray[2] / 2;
            //System.out.println(x);
        } catch (ArithmeticException e) {
            //System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e.getMessage());
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }

        try {
            int x = intArray[2] / 2;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            //System.out.println("Caught"); //Bad practice.
            //System.out.println(e.getMessage());
        }

        try {
            printArrayElementByIndex(intArray, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printArrayElementByIndex(int[] intArray, int index) throws Exception {
        if (index < 0 || index >= intArray.length) {
            throw new Exception("Index " + index + " doesn't exist.");
        }
        System.out.println(intArray[index]);
    }
}