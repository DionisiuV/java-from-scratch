package fundamentals.access_modifiers;

public class AccessModifiers {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John");
        School school = new School(teacher);
        //school.teacher; //Has private access
        System.out.println(school.getTeacher().name);
        System.out.println(school.getTeacher().getName());
    }
}

//Cannot add public modifier
class School {
    //private member of the class
    private Teacher teacher;

    //public constructor
    public School(Teacher teacher) {
        this.teacher = teacher;
    }

    //public method of the class (getter)
    public Teacher getTeacher() {
        return teacher;
    }
}

class Teacher {
    //default (no modifier) member of the class
    String name;

    protected Teacher(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}