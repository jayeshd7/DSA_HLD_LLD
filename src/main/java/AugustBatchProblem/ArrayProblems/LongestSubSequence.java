package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class LongestSubSequence {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
        List<Integer> leftLIS = new ArrayList<>();
        List<Integer> rightLIS = new ArrayList<>();

        if(A.isEmpty()) return 0;

        for(int i = 0 ; i < A.size() ; i++) {
            leftLIS.add(i,1);
            rightLIS.add(i,1);
        }

        int max = 0;
        for(int i = 0 ; i < A.size() ; i++) {
            for(int j = 0 ; j < i ; j++) {
                if(A.get(i) > A.get(j)) {
                    leftLIS.set(i, Math.max(leftLIS.get(i), leftLIS.get(j) + 1));
                }
            }
        }

        for(int i = A.size() - 2 ; i >=0 ;i -- ){
            for(int j = A.size() - 1 ; j >i ; j--) {
                if(A.get(i) > A.get(j)) {
                    rightLIS.set(i, Math.max(rightLIS.get(i), rightLIS.get(j)+1));
                }
            }
        }

        for(int i = 0 ; i < A.size() ; i++) {
            if(max < (leftLIS.get(i) + rightLIS.get(i)) - 1) {
                max = (leftLIS.get(i) + rightLIS.get(i)) - 1;
            }
        }
        return max;
    }
}
