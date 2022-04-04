package exercises.certificates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Does the code below compile? If yes, what's the output?
public class Ex10 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(123, "Java"),
                new Student(122, "Oracle"),
                new Student(132, "Java"),
                new Student(134, "Oracle")
        );
        students.stream()
                .collect(Collectors.groupingBy(Student::getCourse))
                .forEach((s, r) -> System.out.println(r));
    }
}

class Student {
    int id;
    String course;

    public Student(int id, String course) {
        this.id = id;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return id + " " + course;
    }
}
//Timi: 123 Java 132 Java 122 Oracle 134 Oracle
//Rafa: Compile Error.
//Razvan: 123 132 122 134
//Gabriel: 123 Java 132 Java 122 Oracle 134 Oracle
//Valentin: 123 Java 132 Java 122 Oracle 134 Oracle