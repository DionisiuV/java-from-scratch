package advanced_features.lambda_expression;

import java.util.function.Predicate;

public class MethodReference {
    public static void main(String[] args) {
        Person john = new Person("John", 19);
        //Predefined interface.
        Predicate<Person> adultPerson = p -> p.isAdult();
        //System.out.println(adultPerson.test(john));

        Predicate<Person> adult = Person::isAdult;
        System.out.println(adult.test(john));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}