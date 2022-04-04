package advanced_features.cohesion.low_cohesion;

public class LowCohesion {
    public static void main(String[] args) {
        Sum sum = new Sum(2, 3);
        sum.displayResult();
    }
}

class Sum {
    int a, b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getResult() {
        return a + b;
    }

    //Doesn't have much in common.
    void displayResult() {
        int result = getResult();
        System.out.println(result);
    }
}