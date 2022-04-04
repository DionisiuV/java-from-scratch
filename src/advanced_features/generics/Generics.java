package advanced_features.generics;

public class Generics {
    public static void main(String[] args) {
        Economist economist = new Economist();
        Accountant accountant = new Accountant();

        LegalEmployee<Economist> economistLegalEmployee = new LegalEmployee<>();
        economistLegalEmployee.setT(economist);
        //We cannot set a LegalEmployee object of type Economist an Accountant.
        //economistLegalEmployee.setT(accountant); //Incompatible types. It can be detected at compile time.

        //If we need a LegalEmployee object of type Accountant, we have to create a separate one.
        LegalEmployee<Accountant> accountantLegalEmployee = new LegalEmployee<>();
        accountantLegalEmployee.setT(accountant);
        //We cannot set a LegalEmployee object of type Accountant an Economist.
        //accountantLegalEmployee.setT(economist); //Incompatible types. It can be detected at compile time.
    }
}

class LegalEmployee<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

class Economist {}

class Accountant {}