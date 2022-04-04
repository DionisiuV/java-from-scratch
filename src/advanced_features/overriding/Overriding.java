package advanced_features.overriding;

public class Overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //animal.eat(); //eat() method is called according to the type of the object.

        Dog dog = new Dog();
        //dog.eat(); //eat() method is called according to the type of the object.

        Animal cat = new Cat();
        cat.eat(); //eat() method is called according to the type of the object.
    }
}

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Eating meat...");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Eating fish...");
    }
}