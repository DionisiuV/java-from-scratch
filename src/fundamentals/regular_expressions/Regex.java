package fundamentals.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String sentence = "His website address is alexmamo.ro";
        String name = ".*mamo.*"; //Any characters before, any character after

//        boolean isMatch = Pattern.matches(name, sentence);
//        System.out.println(isMatch);

//        Pattern pattern = Pattern.compile(name);
//        Matcher matcher = pattern.matcher(sentence);
//        boolean isNewMatch = matcher.matches();
//        System.out.println(isNewMatch);

//        String capitalLetters = "ZZZ AA PP AA QQQ AAA ZZ AAAA";
//        String termToSearch = "AA";
//        Pattern pattern = Pattern.compile(termToSearch);
//        Matcher matcher = pattern.matcher(capitalLetters);
//        while(matcher.find()) {
//            System.out.println("Found at: "+ matcher.start() + " - " + matcher.end());
//        }

//        System.out.println(Pattern.matches("[Tom]", "m")); //Returns true as m is found.
//        System.out.println(Pattern.matches("[Tom]", "om")); //Returns false as any one of them can be in text not both.
//        System.out.println(Pattern.matches("[tT]om", "Tom")); //Returns true

//        System.out.println(Pattern.matches("[tT]im|[jJ]in", "Tim")); //Returns true
//        System.out.println(Pattern.matches("[tT]im|[jJ]in", "jin")); //Returns true

//        System.out.println(Pattern.matches(".*abc.*", "deabcpq")); //Returns true
//        System.out.println(Pattern.matches("[\\d].*", "123abc")); //Returns true because the string starts with a digit
//        System.out.println(Pattern.matches("[^\\d].*", "123abc")); //Returns false because the string does not start with something other than a digit

//        System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));  //Returns true because the String contains three letters
//        System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));  //Returns true because the String contains three letters
//        System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));  //Returns false because the String does not contain three letters

//        System.out.println(Pattern.matches("\\D*", "abcde")); //Returns true because the String does not contain 0 or more non-digits
//        System.out.println(Pattern.matches("\\D*", "abcde123")); //Returns false because the String contains 0 or more non-digits

        System.out.println(Pattern.matches(".*This.?$", "This is Alex")); //Returns false because This is not at the end followed by any character
        System.out.println(Pattern.matches(".*this.?$", "Alex is this.")); //Returns true because This is at the end followed by any character
    }
}