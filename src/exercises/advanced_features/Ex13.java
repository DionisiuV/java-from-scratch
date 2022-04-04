package exercises.advanced_features;

public class Ex13 implements Readable {
    public static void main(String[] args) {
        System.out.println(Readable.myLuckyValue);
        System.out.println(myLuckyValue);
        Ex13 ex13 = new Ex13();
        System.out.println(ex13.myLuckyValue);
        System.out.println(Ex13.myLuckyValue);
    }
}

interface Readable {
    int myLuckyValue = 3;
}