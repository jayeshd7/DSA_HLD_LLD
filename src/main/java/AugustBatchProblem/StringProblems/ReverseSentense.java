package AugustBatchProblem.StringProblems;

import java.util.regex.Pattern;

public class ReverseSentense {
    public static void main(String[] args) {
        String str = "this is jayesh";
       // reverseWords(str);
        reverseWordByWord(str);
    }

    static String reverseWords(String str) {

        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");


        String[] temp = pattern.split(str);
        String result = "";


        for (int i = temp.length - 1; i >= 0; i--) {

            result = result + temp[i] + " ";
        }
        System.out.println(result);
        return result;
    }

    static String reverseWordByWord(String str) {
        String[] words = str.split(" ");

        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }

            reverseString = reverseString + reverseWord + " ";

        }
        System.out.println(reverseString);
        return reverseString;
    }
}
