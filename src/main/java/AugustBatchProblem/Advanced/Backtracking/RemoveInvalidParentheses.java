package AugustBatchProblem.Advanced.Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/*
Problem Description

Given a string A consisting of lowercase English alphabets and parentheses '(' and ')'. Remove the minimum number of invalid parentheses in order to make the input string valid.

Return all possible results.

You can return the results in any order.



Problem Constraints

1 <= length of the string <= 20


Input Format

The only argument given is string A.


Output Format

Return all possible strings after removing the minimum number of invalid parentheses.


Example Input

Input 1:

 A = "()())()"

Input 2:

 A = "(a)())()"



Example Output

Output 1:

 ["()()()", "(())()"]

Output 2:

 ["(a)()()", "(a())()"]



Example Explanation

Explanation 1:

 By removing 1 parentheses we can make the string valid.
        1. Remove the parentheses at index 4 then string becomes : "()()()"
        2. Remove the parentheses at index 2 then string becomes : "(())()"


 */
public class RemoveInvalidParentheses {
    static int minCount = Integer.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println(solve("()())()"));
    }

    public static ArrayList<String> solve(String s) {
        Set<String> result = new HashSet<>();
        recurse(s, 0, result, new StringBuilder(), 0, 0, 0);
        return new ArrayList<>(result);
    }


    static void recurse(String s, int pos, Set<String> result, StringBuilder buffer, int open, int close, int ctr) {
        if (s.length() == pos) {
            // If string is balanced and number of deletions is <= the best result so far.
            if (open == close && ctr <= minCount) {
                // If number of deletions for current string is same as the best result
                if (ctr == minCount)
                    result.add(buffer.toString());
                    // Throw away all previous results. We have a better string with fewer deletions required.
                else {
                    result.clear();
                    minCount = ctr;
                    result.add(buffer.toString());
                }
            }
            return;
        }

        // Optimization. If string becomes imabalanced by having too many closing parentheses, we prune early, instead of at the end of recursion.
        if (close > open)
            return;

        // If remaining number of characters is less than the number of closing parentheses needed, then valid string is impossible. Return early.
        if (s.length() - pos < open - close)
            return;

        char c = s.charAt(pos);
        if (c == '(') {
            // Try including this char in result.
            buffer.append(c);
            recurse(s, pos + 1, result, buffer, open + 1, close, ctr);
            buffer.deleteCharAt(buffer.length() - 1);

            // Try not including this char.
            recurse(s, pos + 1, result, buffer, open, close, ctr + 1);
        }
        else if (c == ')') {
            // // Try including this char in result.
            buffer.append(c);
            recurse(s, pos + 1, result, buffer, open, close + 1, ctr);
            buffer.deleteCharAt(buffer.length() - 1);

            // Try not including this char.
            recurse(s, pos + 1, result, buffer, open, close, ctr + 1);
        }
        else {
            // Not a parenthesis character. Have to add it.
            buffer.append(c);
            recurse(s, pos + 1, result, buffer, open, close, ctr);
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }
}
