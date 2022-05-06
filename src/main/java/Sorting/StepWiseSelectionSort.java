package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StepWiseSelectionSort {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(6);
        al.add(4);
        al.add(3);
        al.add(7);
        al.add(2);
        al.add(8);
        solve(al);

        //643728 - 4
        //243768 - 2
        //234768  -2
        //234678  -4
        //234678 - 4

    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer>x = new ArrayList<>();
        for (int i = 0; i < A.size()-1; ++i) {
            int min_index = findMinIndex(A, i);

            if (i != min_index)
                Collections.swap(A, i, min_index);

            x.add(min_index);
        }
        System.out.println(x);
        return x;

    }


        private static int findMinIndex (ArrayList < Integer > A,int start){
            int min_index = start;

            ++start;

            while (start < A.size()) {
                if (A.get(start) < A.get(min_index))
                    min_index = start;

                ++start;
            }

            return min_index;
        }
}

