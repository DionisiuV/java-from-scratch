package advanced_features.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        //String bandName = "Beatles";
        //bandName = "NewName";
        Student john = new Student("John");
        //String studentName = john.name; //Compilation Error.
        String studentName = john.getName();
        System.out.println(studentName);

        john.setName("John Smith");
        System.out.println(john.getName());
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}