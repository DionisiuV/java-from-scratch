package fundamentals.stringbuilders;

public class StringBuilderDataType {
    public static void main(String[] args) {
        StringBuilder letters = new StringBuilder();
        //System.out.println(letters);
        letters.append("defdefdefdefdefdef"); //Append a String
        //letters.append('g'); //Append a char
        //letters.append(5); //Append a number
        //letters.append(true); //Append a boolean
        System.out.println(letters.capacity());
        System.out.println(letters.length());

        StringBuilder sb = new StringBuilder();
        //System.out.println(sb.length()); //Since sb doesn't contain anything length = 0;
        //System.out.println(sb.capacity()); //Is 16 because of character spaces that been allocated by default.
        sb.setLength(100);
        //System.out.println(sb.capacity());
        sb = new StringBuilder(50);
        //System.out.println(sb.capacity());

        char lastChar = letters.charAt(letters.length() - 1);
        //System.out.println(lastChar);

        //System.out.println(letters.deleteCharAt(letters.length() - 1));

        StringBuilder newSb = new StringBuilder()
                .append("xyz")
                .append(123);
        //System.out.println(newSb);
    }
}