package advanced_features.nested_calsses.nested_static_class;

public class NestedStaticClasses {
    public static void main(String[] args) {
        //Object of the Inner static class.
        Outer.Inner inner = new Outer.Inner();
        inner.printInner();
    }
}

class Outer {
    static class Inner {
        void printInner() {
            System.out.println("Inner...");
        }
    }
}