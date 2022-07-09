package AugustBatchProblem.StringProblems;

import java.util.regex.Pattern;

public class ReverseSentense {
    public static void main(String[] args) {
        String str = "Enter your name and address";
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


                if (word.length() % 2 == 1) {
                    for (int j = word.length() - 1; j >= 0; j--) {
                        reverseWord = reverseWord + word.charAt(j);

                    }
                    reverseString += reverseWord + " ";
                } else {
                    reverseString += reverseWord + word + " ";
                }
            }
        System.out.println(reverseString);
        return reverseString;
        }


    }

