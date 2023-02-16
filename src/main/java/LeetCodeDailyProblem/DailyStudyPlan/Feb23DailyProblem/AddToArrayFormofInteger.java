package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormofInteger {
    public static void main(String[] args) {
        int[] A = {1, 2, 0, 0};
        int K = 34;
        List<Integer> result = addToArrayForm(A, K);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>res = new ArrayList<>();
        int n = num.length;
        int i = n-1;
        while(i>=0 || k>0){
            if(i>=0){
                k += num[i];
            }
            res.add(k%10);
            k /= 10;
            i--;
        }
        for(int j = 0; j<res.size()/2;j++){
            int temp = res.get(j);
            res.set(j,res.get(res.size()-1-j));
            res.set(res.size()-1-j,temp);
        }
        return res;
    }
}
