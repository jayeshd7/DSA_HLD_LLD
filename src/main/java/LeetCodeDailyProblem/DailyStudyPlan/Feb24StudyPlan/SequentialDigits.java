package LeetCodeDailyProblem.DailyStudyPlan.Feb24StudyPlan;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        System.out.println(sequentialDigits(low, high));
    }

    private static List<Integer> sequentialDigits(int low, int high) {

        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            int num = i;
            for(int j = i + 1; j <= 9; j++){
                num = num * 10 + j;
                if(num >= low && num <= high){
                    result.add(num);
                }
            }
        }
        result.sort((a, b) -> a - b);

        return result;
    }


}
