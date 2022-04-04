package exercises.fundamentals;

//What's the output?
public class Ex16 {
    private static final int i = 99;

    public static void main(String[] arg) {
        for(int i = 0; i < 100; i++) {
            System.out.print(i);
            i++;
            break;
        }
        System.out.println(i);
    }
}