package exercises.advanced_features;

public class Ex12 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
    }
}

class Animal {
    Animal() {
        eat();
    }

    public void eat() {
        System.out.println("Food");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Bones");
    }
}