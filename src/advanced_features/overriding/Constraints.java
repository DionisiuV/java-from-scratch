package advanced_features.overriding;

public class Constraints {}

class Person {
    public void write() {}

    public Planet getPlanet() {
        return new Planet();
    }

    public long getFive() {
        return 5;
    }

    public static String getMessage() {
        return "Hello, World!";
    }

    public String getDay() {
        return "Thursday";
    }
}

class Student extends Person {
    //1.
    @Override
    public void write() {}

    //2.
    @Override
    public Mars getPlanet() {
        return new Mars();
    }

    //3.
    @Override
    public long getFive() {
        return 5;
    }

    //4. Doesn't compile.
//    @Override
//    public int getFive() {
//        return 5;
//    }

    //5. Doesn't compile.
//    @Override
//    public String getMessage() {
//        return "Hello, World!";
//    }

    //6. Doesn't compile.
//    @Override
//    public static String getDay() {
//        return "Thursday";
//    }
}

class Planet {}

class Mars extends Planet {}