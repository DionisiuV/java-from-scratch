package advanced_features.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        //Use methods and fields ONLY from the Animal class.
        Animal animal = new Animal();
        //animal.eat();

        //Use methods and fields from Dog class and Animal class.
        Dog dog = new Dog();
        //dog.bark();
        //dog.eat();
        dog.name = "Pluto";
        //dog.printName();

        //
        Animal cat = new Cat();
        cat.name = "Tom";
        cat.printName();
    }
}

class Animal {
    String name;

    void eat() {
        System.out.println("Eating...");
    }

    void printName() {
        System.out.println(name);
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow...");
    }
}