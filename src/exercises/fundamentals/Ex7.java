package exercises.fundamentals;

public class Ex7 {
    public static void main(String[] args) {
        Variables variables = new Variables(10, 20);
        System.out.println(variables.x + " " + variables.y);
        variables.setVariables(variables);
        System.out.println(variables.x + " " + variables.y);
    }
}

class Variables {
    int x, y;

    Variables(int x, int y) {
        this.x = x;
        y = this.y;
    }

    Variables setVariables(Variables v) {
        v.x = 30;
        v.y = 40;
        return v;
    }
}
//L1 10 0
//L2 30 0 || 30 40