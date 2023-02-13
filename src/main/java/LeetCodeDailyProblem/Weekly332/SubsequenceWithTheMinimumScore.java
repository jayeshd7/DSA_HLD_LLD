package LeetCodeDailyProblem.Weekly332;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsequenceWithTheMinimumScore {
    public static void main(String[] args) {
        String s = "abacaba";
        String t = "bzaa";

        System.out.println(minimumScore(s, t));
    }

    private static int minimumScore(String s, String t) {

        int n = s.length();
        int m = t.length();
        int leftT = 0;

        List<Integer> lefts = new ArrayList<>();

        for(int i =0; i<n && leftT<m;i++) {
            if(s.charAt(i) == t.charAt(leftT)) {
                lefts.add(i);
                leftT++;
            }
        }
        int rightT = m-1;
        List<Integer> rightSs = new ArrayList<>();
        for(int i = n-1; i>=0 && rightT>=0;i--) {
            if(s.charAt(i) == t.charAt(rightT)) {
                rightSs.add(i);
                rightT--;
            }
        }
        int result = Math.min(m-leftT, rightT+1);
        for (int i = 0; i < rightSs.size(); i++) {
            int ind = rightSs.get(i) - 1;
            int left = Collections.binarySearch(lefts, ind);
            if (left < 0) {
                left = ~left;
            } else {
                left++;
            }
            result = Math.min(result, Math.max(0, t.length() - i - 1 - left));
            if (result == 0) {
                break;
            }
        }

        return result;


    }
}
