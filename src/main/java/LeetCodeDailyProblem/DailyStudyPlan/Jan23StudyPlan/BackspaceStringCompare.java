package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String S = "a#c";
        String T = "b";
        System.out.println(backspaceCompare(S, T));
    }

    private static boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!sStack.isEmpty()) {
                    sStack.pop();
                }
            } else {
                sStack.push(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!tStack.isEmpty()) {
                    tStack.pop();
                }
            } else {
                tStack.push(t.charAt(i));
            }
        }
        boolean flag = true;

        if (sStack.size() != tStack.size()) {
            return false;
        }

        if (sStack.isEmpty() && tStack.isEmpty()) {
            return true;
        }

        while (!sStack.isEmpty() && !tStack.isEmpty()) {

            if (sStack.pop() == tStack.pop()) {
                flag =  true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
