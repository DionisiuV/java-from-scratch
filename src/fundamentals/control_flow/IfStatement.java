package fundamentals.control_flow;

public class IfStatement {
    public static void main(String[] args) {
        //If statement
        String today = "Monday";
        if (today.equals("Monday")) {
            //System.out.println("Today is " + today);
        }

        boolean isMonday = today.equals("Monday");
        if (isMonday) {
            //System.out.println("Today is " + today);
        }

        //If-else statement
        boolean isFreezing;
        double degrees = -5.2;
        if (degrees < 0) {
            isFreezing = true;
            //System.out.println("isFreezing: " + isFreezing);
        } else {
            isFreezing = false;
            //System.out.println("isFreezing: " + isFreezing);
        }

        if (degrees < 0) {
            isFreezing = true;
        } else {
            isFreezing = false;
        }
        //System.out.println("isFreezing: " + isFreezing);

        if (degrees < 0)
            isFreezing = true;
        else
            isFreezing = false;
        //System.out.println("isFreezing: " + isFreezing);

        //If-else-if statement
        if (today.equals("Monday")) {
            System.out.println("Today is " + today);
        } else if (today.equals("Tuesday")) {
            System.out.println("Today is " + today);
        } else if (today.equals("Wednesday")) {
            System.out.println("Today is " + today);
        } else {
            System.out.println("Today is another day");
        }
    }
}