package fundamentals.methods;

public class Methods {
    public static void main(String[] args) {
        User alex = new User("Alex", 18);
        //System.out.println(alex.age);

        //alex.printName();
        int alexAge = alex.getAge();
        //System.out.println(alexAge);

        //alex.printMessage("Hello, World!");

        String birthday = User.getBirthday(1, "June", 1980);
        System.out.println(birthday);
    }
}

class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printName() {
        System.out.println(name);
    }

    //Getter
    int getAge() {
        return this.age;
    }

    void printMessage(String message) {
        System.out.println(message);
    }

    static String getBirthday(int day, String month, int year) {
        return day + "-" + month + "-" + year;
    }
}