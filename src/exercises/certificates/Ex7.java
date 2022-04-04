package exercises.certificates;

import java.util.HashMap;
import java.util.Map;

//What's the output at L1 and L2?
public class Ex7 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //map.compute("1", (k, v) -> (v == null) ? k * k : 0); //L1
        //map.compute("2", (k, v) -> (v == null) ? 2 * 2 : 0); //L2
        System.out.println(map.get("1") + " " + map.get("2"));
    }
}
//Timi: Exception, 4.
//Rafa: Error for operator.
//Razvan: IllegalOperationException.
//Gabriel: Exception || IntegerException?!?! || NumberException.
//Valentin: Exception/Error.