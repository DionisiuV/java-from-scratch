package advanced_features.lambda_expression;

import java.util.function.Predicate;

public class LambdaExpression {
    public static void main(String[] args) {
        Crypto bitcoin = new Crypto("Bitcoin", 60_000);
        //Predicate<Crypto> cryptoTest = new CryptoTest();
        //System.out.println(cryptoTest.test(bitcoin));

        Predicate<Crypto> cryptoTest = crypto -> crypto.getValue() > 50_000;
        System.out.println(cryptoTest.test(bitcoin));
    }
}

//The class becomes redundant.
class CryptoTest implements Predicate<Crypto> {
    @Override
    public boolean test(Crypto crypto) {
        return crypto.getValue() > 50_000;
    }
}

class Crypto {
    private String name;
    private double value;

    public Crypto(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}