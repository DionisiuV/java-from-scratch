package exercises.advanced_features;

interface T1 {
    void m1();
}

interface T2 {
    void m1(int x);
}

interface T3 extends T1, T2 {
    void m1();
    void m1(int x);
}

public class Ex14 implements T3 {
    @Override
    public void m1() {}

    @Override
    public void m1(int x) {}

    public static void main(String[] args) {
        Ex14 ex14 = new Ex14();
        ex14.m1();
        ex14.m1(5);

        T3 t3 = new Ex14();
        t3.m1();
        t3.m1(6);

        ((T1) ex14).m1();
        ((T2) ex14).m1(5);
    }
}