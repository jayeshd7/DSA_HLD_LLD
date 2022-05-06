package AugustBatchProblem.Hashing;

import java.util.ArrayList;

public class FirstRepeatingElement {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(10);
        A.add(5);
        A.add(3);
        A.add(4);
        A.add(7);
        A.add(6);
        A.add(6);
        solve(A);
    }

    private static int solve(ArrayList<Integer> A) {


        int n = A.size();

        for(int i =0; i<n;i++){
            for(int j =i+1;j<n;j++){
                if(A.get(i).equals(A.get(j))){
                    System.out.println(A.get(j));
                    return A.get(j);
                }


            }
        }
        System.out.println(-1);
        return -1;
    }
}
