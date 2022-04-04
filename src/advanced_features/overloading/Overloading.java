package advanced_features.overloading;

public class Overloading {
    public static void main(String[] args) {
        SubMath subMath = new SubMath();
        System.out.println(subMath.square(25));
        System.out.println(subMath.square(25L));
        System.out.println(subMath.square(25.25));
        System.out.println(subMath.square(25.25f));

        Physics obj1 = new Physics();
        Physics obj2 = new Physics("atomic");
        Physics obj3 = new Physics("atomic", "name");
    }
}

class SuperMath {
    //Overloaded method
    int square(int number) {
        return number * number;
    }

    //Overloaded method
    long square(long number) {
        return number * number;
    }
}

class SubMath extends SuperMath {
    //Overloaded method
    double square(double number) {
        return number * number;
    }

    //Overloaded method
    String square(float number) {
        return String.valueOf(number * number);
    }
}

class Physics {
    private String type, name;

    //Overloaded constructor
    public Physics() {}

    //Overloaded constructor
    public Physics(String type) {
        this.type = type;
    }

    //Overloaded constructor
    public Physics(String type, String name) {
        this.type = type;
        this.name = name;
    }
}