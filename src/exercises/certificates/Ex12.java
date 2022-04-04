package exercises.certificates;

import java.util.function.Function;

//What's the output?
public class Ex12 {
    public static void main(String[] args) {
        Integer myNum = 100;
        System.out.print(
                doOperation(myNum, num -> num + num) + " "
        );
        myNum = 15;
        doOperation(
                myNum, num -> num * 10
        );
        System.out.println(
                myNum
        );
    }

    static Integer doOperation(
            Integer op,
            Function<Integer, Integer> function
    ) {
        return function.apply(op);
    }
}
//Timi: 200 150
//Rafa: 200 150
//Razvan: 100 15 15
//Gabriel: 200 15
//Valentin: 200 15