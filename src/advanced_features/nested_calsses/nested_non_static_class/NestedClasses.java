package advanced_features.nested_calsses.nested_non_static_class;

public class NestedClasses {
    public static void main(String[] args) {
        //Object of the Outer class.
        Outer outer = new Outer();
        //outer.printOuter();
        //Object of the Inner class.
        Outer.Inner inner = new Outer().new Inner();
        inner.printInner();

        MyClass myClass = new MyClass();
        myClass.new Inner().printInner();
    }
}

class Outer {
    private String name = "Alex";

    String printOuter() {
        System.out.println("Outer..." + name);
        return "Sorin";
    }

    class Inner {
        void printInner() {
            System.out.println("Inner..." + name + printOuter());
        }
    }
}

class MyClass extends Outer {
    class InnerMyClass {
        void printInnerMyClass() {
            System.out.println("InnerMyClass...");
        }
    }
}