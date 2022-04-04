package exercises.advanced_features;

public class Ex7 {
    public static void main(String[] args) {
        Base derived = new Derived();
        derived.bar(); //L1
        derived.foo(derived); //L2
    }
}

class Base {
    public static void foo(Base derived) {
        System.out.println("In Base.foo()");
        derived.bar();
    }

    public void bar() {
        System.out.println("In Base.bar()");
    }
}

class Derived extends Base {
    public static void foo(Base bObj) {
        System.out.println("In Derived.foo()");
        bObj.bar();
    }

    @Override
    public void bar() {
        System.out.println("In Derived.bar()");
    }
}