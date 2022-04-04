package exercises.certificates;

//What's the output?
public class Ex4 {
    public static void main(String[] args) {
        Integer testId = null;
        String courseCode = "120";
        String enrollmentId = "2022";
        testId = Integer.parseInt(courseCode + " " + enrollmentId);
        System.out.printf("%s = %d", "testId", testId);
    }
}
//Timi: testId = NumberException
//Rafa: NullPointerException
//Razvan: Exception Parse?!?! InvalidNumberException
//Gabriel: Exception Parse?!?!
//Valentin: Exception Parse?!?!