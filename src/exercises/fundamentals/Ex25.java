package exercises.fundamentals;

public class Ex25 {
    public static void main(String[] args) {
        String alex = "Alex";
        System.out.println(reverse(alex));
    }

    static String reverse(String name) {
        if (name.isEmpty())return name;
        return reverse(name.substring(1)) + name.charAt(0);
    }
}