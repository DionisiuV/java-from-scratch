package design_patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Composite {
    public static void main(String[] args) {
        Department sales = new SalesDepartment("Sales");
        //sales.printName();
        Department financial = new FinancialDepartment("Financial");
        HeadDepartment head = new HeadDepartment("Head");

        head.addDepartment(sales);
        head.addDepartment(financial);
        head.printAllDepartment();
    }
}

@FunctionalInterface
interface Department {
    void printName();
}

class SalesDepartment implements Department {
    private String name;

    public SalesDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}

class FinancialDepartment implements Department {
    private String name;

    public FinancialDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}

class HeadDepartment implements Department {
    private String name;
    private List<Department> childDepartments;

    public HeadDepartment(String name) {
        this.name = name;
        childDepartments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }

    public void printAllDepartment() {
//        Consumer<Department> consumer = new Consumer<Department>() {
//            @Override
//            public void accept(Department department) {
//                department.printName();
//            }
//        };
//        childDepartments.forEach(consumer);
        //childDepartments.forEach(d -> d.printName());
        childDepartments.forEach(Department::printName);
    }
}