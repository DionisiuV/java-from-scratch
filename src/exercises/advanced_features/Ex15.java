package exercises.advanced_features;

abstract class A1 {
    public void m0() {
        System.out.println("Orange");
    }

    public abstract void m1();

    public void m2() {
        System.out.println("Green");
    }
}

abstract class A2 extends A1 {
    public abstract void m3();

    public void m1() {
        System.out.println("Cyan");
    }

    public void m2() {
        System.out.println("Blue");
    }
}

class A3 extends A2 {
    public void m1() {
        System.out.println("Yellow");
    }

    public void m2() {
        System.out.println("Pink");
    }

    public void m3() {
        System.out.println("Red");
    }
}

public class Ex15 {
    public static void main(String[] args) {
        A2 a = new A3();
        a.m0();
        a.m1();
        a.m2();
        a.m3();
    }
}
//Orange, Yellow, Pink, Red