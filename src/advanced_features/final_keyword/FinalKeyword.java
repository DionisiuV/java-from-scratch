package advanced_features.final_keyword;

public class FinalKeyword {
    final static int i = 1;

    public static void main(String[] args) {
        //i = 2; //Cannot change the value.
    }
}

//final class Super {}

//class Sub extends Super {} //Cannot use extends Super.

class SuperClass {
    final void print() {
        System.out.println("Printing...");
    }

    void print(String message) {
        System.out.println(message);
    }
}

class SubClass extends SuperClass {
    //Cannot override a final method.
//    @Override
//    void print() {
//        System.out.println("Printing.......");
//    }
}