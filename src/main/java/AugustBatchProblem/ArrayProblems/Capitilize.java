package AugustBatchProblem.ArrayProblems;

import java.util.Locale;

public class Capitilize {
    public static void main(String[] args) {
        capitilize("i am jayesh");
    }

    private static void capitilize(String str) {
        String res = "";
        String words [] = str.split("\\s");
        for(String word : words){
            String first = word.substring(0,1).toUpperCase();
            String restString = word.substring(1);
            res = res + first + restString + " ";
        }
        System.out.println(res);
    }
}
