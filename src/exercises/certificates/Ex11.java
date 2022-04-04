package exercises.certificates;

//What's the output?
public class Ex11 {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getSalary(10_000));
    }
}

class Employee {
    public int getSalary(int s) {
        double tax = 0.5;

        class SalaryCalculator {
            public int pay(int s) {
                return s - (int) (s * tax);
            }
        }
        SalaryCalculator sc = new SalaryCalculator();
        return sc.pay(s);
    }
}
//Timi: 5000
//Rafa: 5000
//Razvan: 5000
//Gabriel: 5000
//Valentin: 5000