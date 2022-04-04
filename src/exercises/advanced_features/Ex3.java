package exercises.advanced_features;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
        new Sub();
    }
}

class Super {
    public static final String ID = "myId";
}

class Sub extends Super {
    static {
        System.out.print("In Sub");
    }
}