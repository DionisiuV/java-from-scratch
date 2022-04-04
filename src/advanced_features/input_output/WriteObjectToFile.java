package advanced_features.input_output;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteObjectToFile {
    static Path path = Paths.get("src/advanced_features/input_output/product.txt");

    public static void main(String[] args) {
        Product bag = new Product("Bag", 5.99);
        writeProductToFile(bag);
        readProductFromFile();
    }

    private static void writeProductToFile(Product bag) {
        //Try and catch with resources.
        try(FileOutputStream fileOutputStream = new FileOutputStream(path.toFile()); //Requires a File object.
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(bag);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readProductFromFile() {
        //Try and catch with resources.
        try(FileInputStream fileInputStream = new FileInputStream(path.toFile()); //Requires a File object.
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Product product = (Product) objectInputStream.readObject();
            System.out.println(product);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Product implements Serializable {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " -> " + price;
    }
}