package fundamentals.classes;

public class Classes {
    public static void main(String[] args) {
        //new User(); //It means that call the constructor and create a new object.
        //User user = new User(); //Save the object into a variable.
        //System.out.println(user);
        //User user1 = new User();
        //System.out.println(user1);

        Address myAddress = new Address("Route 66", 15, "NY", "USA", 123);
        //System.out.println(myAddress.streetName);
        //System.out.println(myAddress.postalCode);

        User alex = new User("Alex", 18, 1.78, myAddress);
        //System.out.println(alex.name);
        //System.out.println(alex.address.country);

        FormulaOneCar pinkCar = new FormulaOneCar();
        pinkCar.color = "pink";
        System.out.println(pinkCar.color);
    }
}

class User {
    String name;
    int age;
    double height;
    Address address;

    //User() {
        //System.out.println("User class constructor called.");
    //}


    User(String name, int age, double height, Address address) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.address = address;
    }
}

class Address {
    String streetName;
    int streetNumber;
    String city, country;
    int postalCode;

    //The default constructor

    Address(String streetName, int streetNumber, String city, String country, int postalCode) {
        //System.out.println(streetName);
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }
}