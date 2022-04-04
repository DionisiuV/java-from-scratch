package fundamentals.methods.exercises;

//Create a Physics class with one method that generates a formula.
//Create another class called Sys that has a member class that prints the formula.
//The method from the Sys class must be called from within the method from the Physics class.
public class Ex3 {
    public static void main(String[] args) {
        Physics physics = new Physics();
        physics.generateFormula();
    }
}

class Physics {
    void generateFormula() {
        String formula = "xyz";
        Sys sys = new Sys();
        sys.print(formula);
    }
}

class Sys {
    void print(String formula) {
        System.out.println(formula);
    }
}