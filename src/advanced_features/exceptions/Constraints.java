package advanced_features.exceptions;

public class Constraints {
}

class Super {
    public Super() throws SubException {}

    public String getString() throws SuperException {
        return "Super";
    }
}

class Sub extends Super {
    public Sub() throws SuperException {}

    @Override
    public String getString() throws SubException {
        return "Sub";
    }
}

class SuperException extends Exception {}

class SubException extends SuperException {}

class SubSubException extends SubException {}