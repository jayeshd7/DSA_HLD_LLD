package LeetCodeDailyProblem.DailyStudyPlan.Dec22StudyPlan;

import java.util.HashSet;

public class Duplet {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4};
        int target = 5;
        int [] ans = findDuple(numbers,target);
        for(int i : ans){
            System.out.println(i);
        }
    }

    private static int[] findDuple(int[] numbers, int target) {

        int n = numbers.length;
        int [] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n;i++){
            int curr_Sum = target-numbers[i];
            if(set.contains(target-numbers[i])){
                ans[0] = numbers[i];
                ans[1] = curr_Sum;
                return ans;
            }else {
                set.add(numbers[i]);
            }
        }
        return ans;
    }
}
