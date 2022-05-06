package AugustBatchProblem.Day1;

import java.util.ArrayList;

public class MinimumPicks {

    public static void main(String[] args) {
        ArrayList al = new ArrayList<Integer>();
        al.add(5);
        al.add(17);
        al.add(100);
        al.add(1);
        solve(al);

    }
    public static int  solve(ArrayList<Integer> arr) {

        int min = arr.get(0);
        int max = arr.get(0);

        // store the length of the ArrayList in variable n
        int n = arr.size();

        // loop to find minimum from ArrayList
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min && arr.get(i) %2 !=0) {
                min = arr.get(i);
            }

        }

        // loop to find maximum from ArrayList
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max && arr.get(i) %2 == 0) {

                max = arr.get(i);
            }
        }
        // The result will be printed
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
        System.out.println("difference is : " + (max-min));
        return (max -min);
    }
}
