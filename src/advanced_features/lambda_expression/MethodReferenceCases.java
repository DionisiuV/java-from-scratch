package advanced_features.lambda_expression;

public class MethodReferenceCases {
    public static void main(String[] args) {
        //Method reference (static method).
        //Walkable walkable = MethodReferenceCases::walkInRain;
        //walkable.walk();

        //Method reference (instance method).
        //MethodReferenceCases cases = new MethodReferenceCases();
        //Walkable walkable = cases::walkInSnow;
        //walkable.walk();

        //Method reference (instance method using an anonymous object).
        //Walkable walkable = new MethodReferenceCases()::walkInSnow;
        //walkable.walk();

        //Method reference (constructor)
        Walkable walkable = Weather::new;
        walkable.walk();
    }

    public static void walkInRain() {
        System.out.println("Walking in rain...");
    }

    public void walkInSnow() {
        System.out.println("Walking in snow...");
    }
}

@FunctionalInterface
interface Walkable {
    void walk();
}

class Weather {
    public Weather() {
        System.out.println("Walking in good weather...");
    }
}