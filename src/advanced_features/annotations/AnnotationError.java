package advanced_features.annotations;

public class AnnotationError {}

class Super {
    public void print(String message) {
        System.out.println(message);
    }
}

class Sub extends Super {
//    @Override
//    public void print(StringBuilder message) {
//        System.out.println(message);
//    }
}