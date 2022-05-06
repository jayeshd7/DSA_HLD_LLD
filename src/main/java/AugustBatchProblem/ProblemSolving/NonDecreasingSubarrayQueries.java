package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class NonDecreasingSubarrayQueries {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(1);A.add(7);A.add(3);A.add(4);A.add(1);

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        ArrayList<Integer>B = new ArrayList<>();
        B.add(1); B.add(2); arrayLists.add(B);


        arrayLists.add(B);
        System.out.println(solve(A, arrayLists));

    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> pf = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();
        int n = A.size();
        for(int k =0; k<n;k++){
            pf.add(0);
        }
        int sum = 0;

        for(int i =1; i<n;i++){
            if(A.get(i) < A.get(i-1)){
                pf.set(i,pf.get(i-1)+1);
            }
            else{
                pf.set(i,pf.get(i-1));
            }

        }
        System.out.println(pf);
        for (int i = 0; i < B.size(); i++)
        {
            int l = B.get(i).get(0);
            int r = B.get(i).get(1) - 1;

            // If pre[r] - pre[l-1] exceeds 0
            if (pf.get(r) - pf.get(l - 1) == 0){
                x.add(1);
            }

            else
               x.add(0);
        }
        return x;
    }
}
