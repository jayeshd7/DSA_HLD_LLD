package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

import java.util.HashMap;
import java.util.Map;

public class FruitsAndBaskets {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1};
        System.out.println(totalFruit(fruits));
    }

    public static int totalFruit(int[] fruits) {
        int n = fruits.length, ans = 0, i = 0, j = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        while (j < n) {
            mp.put(fruits[j], mp.getOrDefault(fruits[j], 0) + 1);
            while (mp.size() > 2) {
                mp.put(fruits[i], mp.get(fruits[i]) - 1);
                if (mp.get(fruits[i]) == 0) {
                    mp.remove(fruits[i]);
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
