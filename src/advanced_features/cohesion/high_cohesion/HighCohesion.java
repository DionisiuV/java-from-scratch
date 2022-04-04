package advanced_features.cohesion.high_cohesion;

public class HighCohesion {
    public static void main(String[] args) {
        Sum sum = new Sum(2, 3);
        int result = sum.getResult();
        App app = new App();
        app.displayResult(result);
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
}

class App {
    void displayResult(int result) {
        System.out.println(result);
    }
}