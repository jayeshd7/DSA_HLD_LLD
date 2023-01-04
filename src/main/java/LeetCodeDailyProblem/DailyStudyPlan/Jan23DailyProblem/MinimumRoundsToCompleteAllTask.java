package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.HashMap;

public class MinimumRoundsToCompleteAllTask {
    public static void main(String[]args) {
        int[] tasks = {2, 2, 3, 3, 2, 4, 4, 4, 4, 4};
        System.out.println(minimumRounds(tasks));
    }

    private static int minimumRounds(int[] tasks) {

        int n = tasks.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }

        for(Integer val: map.values()){
            int freq = val;
            if(freq<2){ return -1;}
            else if(freq==2){
                ans += 1;
        }else {
                double res = freq/3.0;
                ans += Math.ceil(res);

            }
        }
        return ans;
    }
}
