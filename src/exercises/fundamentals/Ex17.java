package exercises.fundamentals;

//What's the output of the first while loop?
//How about the second one?
public class Ex17 {
    public static void main(String[] args){
        int k = 2;

//        do {
//            System.out.print(k);
//        } while (k-- > 0);

        do {
            System.out.print(k);
        } while (--k > 0);
    }
}