package advanced_features.execution_order;

public class ExecutionOrder {
    public static void main(String[] args) {
        //new SubClass();
        System.out.println(SubClass.i);
    }
}

class SuperClass {
    static {
        System.out.println("Static block of SuperClass");
    }

    {
        System.out.println("Non-static block of SuperClass");
    }

    public SuperClass() {
        System.out.println("SuperClass constructor called");
    }
}

class SubClass extends SuperClass {
    static int i = 1;

    static {
        System.out.println("Static block of SubClass");
    }

    {
        System.out.println("Non-static block of SubClass");
    }

    public SubClass() {
        System.out.println("SubClass constructor called");
    }
}