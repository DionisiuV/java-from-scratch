package exercises.advanced_features;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();

        Contract superContract = new SuperClass();
        objects.add(superContract);

        Contract subContract = new SubClass();
        objects.add(subContract);

        SuperClass sub = new SubClass();
        objects.add(sub);

        for (Object o : objects) {
            System.out.println(o.toString());
        }
    }
}

interface Contract {}

class SuperClass implements Contract {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

class SubClass extends SuperClass {}