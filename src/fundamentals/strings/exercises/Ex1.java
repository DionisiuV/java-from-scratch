package fundamentals.strings.exercises;

public class Ex1 {
    public static void main(String[] args) {
        String country = "United Kingdom";
        int countryLength = country.length();
        //System.out.println(countryLength);
        char k = country.charAt(7);
        //System.out.println(k);
        //System.out.println("United " + k + "ingdom");

        String password = "1234";
        System.out.println(password.isEmpty());
        System.out.println(password.length() < 4);
    }
}