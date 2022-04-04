package fundamentals.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        //System.out.println(Pattern.matches(".s", "vs")); //True
        //System.out.println(Pattern.matches(".v", "vs")); //False
        //System.out.println(Pattern.matches(".a", "vsa")); //False
        //System.out.println(Pattern.matches("..a", "vsa")); //True

        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaaaaaaaaaaaaaaaaaaab");
        System.out.println(matcher.matches()); //True
    }
}