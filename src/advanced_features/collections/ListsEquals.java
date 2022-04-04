package advanced_features.collections;

import java.util.Arrays;
import java.util.List;

public class ListsEquals {
    public static void main(String[] args) {
        //compareListsOfNumbers();
        //compareListsOfStrings();
        compareListsOfObjects();
    }

    private static void compareListsOfNumbers() {
        List<Integer> firstList = Arrays.asList(10, 15, 20);
        List<Integer> secondList = Arrays.asList(10, 15, 20);
        System.out.println(firstList.equals(secondList));
    }

    private static void compareListsOfStrings() {
        List<String> firstList = Arrays.asList("10", "15", "20");
        List<String> secondList = Arrays.asList("10", "15", "20");
        System.out.println(firstList.equals(secondList));
    }

    private static void compareListsOfObjects() {
        List<Student> firstList = Arrays.asList(
                new Student("A", 10),
                new Student("B", 15),
                new Student("C", 20)
        );
        List<Student> secondList = Arrays.asList(
                new Student("A", 10),
                new Student("B", 15),
                new Student("C", 20)
        );
        System.out.println(firstList.equals(secondList));
        compareSpecial(firstList, secondList);
    }

    private static <T> void compareSpecial(List<T> firstList, List<T> secondList) {
        System.out.println(firstList.equals(secondList));
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return this.name.equals(student.name) && this.age == student.age;
    }
}