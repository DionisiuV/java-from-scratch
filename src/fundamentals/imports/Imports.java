package fundamentals.imports;

import fundamentals.imports.data.Car;

import java.util.*;

public class Imports {
    public static void main(String[] args) {
        String name = "Alex"; //No import is needed
        Short shortNumber = 1; //No import is needed

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.Random random = new java.util.Random();
        fundamentals.imports.data.Car car = new fundamentals.imports.data.Car();

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        Car c = new Car();
    }
}