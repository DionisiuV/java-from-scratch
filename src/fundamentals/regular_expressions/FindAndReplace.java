package fundamentals.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndReplace {
    public static void main(String[] args) {
        String sentence = "The dog say meow. All dogs sat meow.";
        //String wordToBeReplaced = "dog";
        //String replacePattern = "cat";

        Pattern pattern = Pattern.compile("dog");
        Matcher matcher = pattern.matcher(sentence);
        sentence = matcher.replaceAll("cat");
        System.out.println(sentence);
    }
}