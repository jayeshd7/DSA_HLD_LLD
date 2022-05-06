package AugustBatchProblem.BasicOfMath;

import java.util.ArrayList;

public class Arrange {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);al.add(0); al.add(2);al.add(1); al.add(3);
        //int [] al = { 4, 0, 2, 1, 3};
        solve(al);
    }

    private static void solve(ArrayList<Integer>A) {


        int n = A.size();

            // First step: Increase all values by (arr[arr[i]]%n)*n - arraylist Approch
            for (int i = 0; i < n; i++) {

                A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
                // 3 % 5 = 3
                // 3 * 5 = 15
                // 15 + 4 = 19
                // 19 /5 - 3



            }
            // Second Step: Divide all values by n
            for (int i = 0; i < n; i++)
                A.set(i,(A.get(i) / n)) ;


        System.out.println(A);

    }
}
