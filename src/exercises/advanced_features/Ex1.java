package exercises.advanced_features;

public class Ex1 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println((b instanceof A) && !(b instanceof C) && !(b instanceof D));
    }
}

class A {}

class B extends A {}

class C extends B {}

class D extends C {}