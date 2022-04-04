package advanced_features.nested_calsses.nested_interfaces;

public class NestedInterface {
    public static void main(String[] args) {
        OuterClass.InnerInterface inner = new OuterClass().new InnerClass();
        inner.printInnerDefault();
        OuterClass.InnerInterface.printInnerStatic();
    }
}

class OuterClass {
    //Are by default static.
    interface InnerInterface {
        default void printInnerDefault() {
            System.out.println("Inner default");
        }

        static void printInnerStatic() {
            System.out.println("Inner static");
        }
    }

     class InnerClass implements InnerInterface {}
}

class MyClass implements OuterClass.InnerInterface {}