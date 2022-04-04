package fundamentals.strings;

public class StringDataType {
    public static void main(String[] args) {
        String name = "Alex";
        //System.out.println(name);
        int nameLength = name.length();
        //System.out.println(nameLength);

        //String fullName = "Alex Mamo";
        String fullName = new String("Alex Mamo");
        //System.out.println(fullName);

        //Comparison
        String nickName = new String("Alex Mamo");
        //System.out.println(fullName == nickName);
        //System.out.println(fullName.equals(nickName));

        String hello = "Hello";
        String commaWhiteSpace = ", ";
        String world = "World";
        String message = hello + commaWhiteSpace + world;
        //System.out.println(message);

        name = "Alexis";
        //System.out.println(name);

        var today = "Thursday";
        var newMessage = "Today is " + today + ".";
        //System.out.println(newMessage);

        var year = 2021;
        var yearMessage = "Current year is " + year;
        //System.out.println(yearMessage);

        var isAdmin = true;
        var adminMessage = "Admin is " + isAdmin;
        //System.out.println(adminMessage);

        char symbol = adminMessage.charAt(3);
        //System.out.println(symbol);

        boolean startWithAdm = adminMessage.startsWith("Adm");
        //System.out.println(startWithAdm);

        boolean endWith = adminMessage.endsWith("true");
        //System.out.println(endWith);

        //int -> String
        int age = 18;
        String stringAge = String.valueOf(age);
        //System.out.println(stringAge);

        //String -> int
        String newAge = "22";
        int stringNewAge = Integer.valueOf(newAge);
        //System.out.println(stringNewAge);

        //System.out.println("22" + "44");

        String movieName = "stAr WaRs";
        //System.out.println(movieName.toLowerCase());
        //System.out.println(movieName.toUpperCase());

        String newMovieName = "         stAr WaRs          ";
        //System.out.println(newMovieName.trim().toLowerCase());

        String a = "Alex";
        String b = "Alex";
        System.out.println(a == b);
    }
}