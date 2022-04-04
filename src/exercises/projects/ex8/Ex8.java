package exercises.projects.ex8;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Processor("Intel", "i9", "3.6 Ghz"));
        products.add(new Ram("Kingston", "DDR4", "32 GB"));

        //products.add(new Product("???", "???"));

        Product ram = products.stream().filter(product -> product.brand.equals("Kingston")).toList().get(0);
        System.out.println(ram.brand);
    }
}

class Product {
    String brand, model;

    public Product(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

class Processor extends Product {
    String speed;

    public Processor(String brand, String model, String speed) {
        super(brand, model);
        this.speed = speed;
    }
}

class Ram extends Product {
    String capacity;

    public Ram(String brand, String model, String capacity) {
        super(brand, model);
        this.capacity = capacity;
    }
}