package design_patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Strategy {
    public static void main(String[] args) {
        Product pen = new Product("1234", 3.99);
        Product bag = new Product("5678", 5.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(pen);
        cart.addProduct(bag);

        CreditCard myCard = new CreditCard("John", "12345678", 123, "12/22");
        InternetBanking myIng = new InternetBanking("alexmamo@gmail.com", "123456");
        cart.payWith(myCard);
    }
}

@FunctionalInterface
interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public CreditCard(String name, String cardNumber, int cvv, String expirationDate) {}

    @Override
    public void pay(double amount) {
        System.out.println(amount + " was paid with credit card.");
    }
}

class InternetBanking implements Payment {
    public InternetBanking(String email, String password) {}

    @Override
    public void pay(double amount) {
        System.out.println(amount + " was paid with internet banking.");
    }
}

class Product {
    public String barCode;
    public double price;

    public Product(String barCode, double price) {
        this.barCode = barCode;
        this.price = price;
    }
}

class ShoppingCart {
    List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotal() {
        return products.stream().mapToDouble(new ToDoubleFunction<Product>() {
            @Override
            public double applyAsDouble(Product product) {
                return product.price;
            }
        }).sum();
    }

    public void payWith(Payment paymentMethod) {
        double total = getTotal();
        paymentMethod.pay(total);
    }
}