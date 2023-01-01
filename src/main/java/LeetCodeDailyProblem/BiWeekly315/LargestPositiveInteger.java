package LeetCodeDailyProblem.BiWeekly315;

import java.util.HashSet;

public class LargestPositiveInteger {
    public static void main(String[] args) {
        int [] input = {-1,2,3,-3,4,-4,-5};
        int n = input.length;
        System.out.println(largestPositiveInteger(input, n));
    }

    private static int largestPositiveInteger(int[] input, int n) {
        int ans = -1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(input[i]);
        }
        for (int i = 0; i < n; i++) {
            if (hs.contains(-input[i])) {
                ans = Math.max(ans,input[i]);
            }

        }
        return ans;
    }


}
