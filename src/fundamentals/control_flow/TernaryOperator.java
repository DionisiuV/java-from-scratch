package fundamentals.control_flow;

public class TernaryOperator {
    public static void main(String[] args) {
        String today = "Monday";
        if (today.equals("Monday")) {
            System.out.println("Today is " + today);
        } else {
            System.out.println("Wrong day.");
        }

        String message = today.equals("Monday") ? "Today is Monday" : "Wrong day.";
        System.out.println(message);
    }
}