package fundamentals.control_flow;

public class SwitchStatement {
    public static void main(String[] args) {
        int day = 1;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            default:
//                System.out.println("Wrong day");
//        }

//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            default -> System.out.println("Wrong day");
//        }

        char letter = 'a';
//        char capitalLetter = switch (letter) {
//            case 'a' -> {
//                System.out.print("The capital letter of " + letter + " is ");
//                yield 'A';
//            }
//            case 'b' -> {
//                System.out.print("The capital letter of " + letter + " is ");
//                yield 'B';
//            }
//            case 'c' -> {
//                System.out.print("The capital letter of " + letter + " is ");
//                yield 'C';
//            }
//            default -> {
//                System.out.print("The capital letter of " + letter + " is ");
//                yield '*';
//            }
//        };
        //System.out.println(capitalLetter);

        char capLetter = switch (letter) {
            case 'a' -> 'A';
            case 'b' -> 'B';
            case 'c' -> 'C';
            default -> '*';
        };
        System.out.print("The capital letter of " + letter + " is " + capLetter);
    }
}