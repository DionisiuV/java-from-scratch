package fundamentals.variables;

public class InstanceVariable {
    public static void main(String[] args) {
        new Num();
    }
}

class Num {
    int i;

    public Num() {
        System.out.println("i = " + i);
    }
}