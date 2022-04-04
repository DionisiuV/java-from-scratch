package exercises.advanced_features;

public class Ex11_2 {
    String s = "eq";
    String ss = "eq";

    public static void main(String[] args) {
        Ex11_2 ex = new Ex11_2();
        Ex11_2 exx = new Ex11_2();

        //1.
        if (ex.s == exx.ss) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        //2.
        if (ex.s.equals(exx.ss)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}