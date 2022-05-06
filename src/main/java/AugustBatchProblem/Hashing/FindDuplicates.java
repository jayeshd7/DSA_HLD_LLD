package AugustBatchProblem.Hashing;

import java.util.HashMap;

public class FindDuplicates {

    public static void main(String[] args) {
        int A [] = {1,2,3,4,5};
        int B [] = {5,4,7,8,9};
        solve(A,B);
    }

    private static void solve(int [] A, int [] B) {

        int n = A.length;
        int m = B.length;
        HashMap<Integer, Boolean> hashMapA = new HashMap();
        HashMap<Integer, Boolean> result  = new HashMap();

        for(int i =0; i<n;i++){

            hashMapA.put(A[i], true);
        }
        for(int j =0;j<m;j++){
            if(hashMapA.containsKey(B[j])){
                result.put(B[j],true);
            }
        }
        System.out.println(result.keySet());
    }
}
