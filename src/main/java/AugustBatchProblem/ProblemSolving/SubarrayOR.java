package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class SubarrayOR {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1); A.add(2); A.add(3);A.add(4);A.add(5);
        System.out.println(solve(A));
        System.out.println(optimizeSolve(A));

        // {1}, {2}, {3} ,{1,2} ,{2,3}, {1,2,3}
        //  1   2     3    3     4   4 ->
        // n*(n+1)/2 == kitne subarray ?

    }

    // n solution
    public static int optimizeSolve(ArrayList<Integer> A) {
        long ans = 0;
        int n = A.size();
        for(int i =0;i<=30;i++){
            int curr_ind = n;
            for(int j = n-1;j>=0;j--){
                int bit = (A.get(j) >> i)&1;
                if(bit == 1){ curr_ind = j;}
                long t = n-curr_ind;
                ans += t * (1 << i);

            }
        }
        return (int) (ans % 1000000007);
    }
    //n2 solution
    public static int solve(ArrayList<Integer> A) {
            long ans = 0;
            int n = A.size();
            for(int i =0;i<n;i++){
                int curr_or = 0;
                for(int j = i;j<n;j++){
                    curr_or |= A.get(j);
                    ans += curr_or;
                }
            }
            return (int) (ans % 1000000007);
    }
        // 1 2 3 4 5
       //  0001
       //  0010
       //  0011


   //  {1}{2}{3}{4}{5}

}

