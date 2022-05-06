package AugustBatchProblem.Advanced.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Given a digit string A, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.

NOTE: Make sure the returned strings are lexicographically sorted.



Problem Constraints

1 <= |A| <= 10


Input Format

The only argument is a digit string A.


Output Format

Return a string array denoting the possible letter combinations.


Example Input

Input 1:

 A = "23"

Input 2:

 A = "012"



Example Output

Output 1:

 ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]

Output 2:

 ["01a", "01b", "01c"]
 */
public class LetterPhone {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));

    }
    public static ArrayList<String> letterCombinations(String A) {

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "0");
        map.put(1, "1");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        ArrayList<String> ans = new ArrayList<>();

        letterCombinationsRecursive(A, ans, map, new StringBuilder(), 0);

        return ans;
    }

    private static void letterCombinationsRecursive(String a, ArrayList<String> ans, Map<Integer, String> map, StringBuilder sb, int id) {
        if (id > a.length()) {
            return;
        }

        if (id == a.length() && sb.length() == a.length()) {
            ans.add(new StringBuilder(sb.toString()).toString());
        }
        else {
            for (int i=id; i<a.length(); i++) {
                String mapping = map.get(Integer.valueOf(String.valueOf(a.charAt(i))));
                for (int j=0; j<mapping.length(); j++) {
                    // Choose
                    sb.append(mapping.charAt(j));

                    // Explore
                    letterCombinationsRecursive(a, ans, map, sb, i+1);

                    // Un-choose
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }



    }

}
