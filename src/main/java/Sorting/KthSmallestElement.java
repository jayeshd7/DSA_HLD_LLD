package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KthSmallestElement {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(1);
        al.add(4);
        al.add(3);
        al.add(2);
        int B = 1;
        int [] alB = {2,1,4,3,2};
        kthsmallest(alB, B);
    }

    public static int kthsmallest(final int [] A, int B) {

        /*for (int i = 0; i < B; i++) {
            int minn = Integer.MAX_VALUE, idx = 0;
            for (int j = i; j < A.size(); j++) {
                if (A.get(j) < minn) {
                    minn = A.get(j);
                    idx = j;
                }
            }
            int tmp = A.get(i);


            A.set(i,A.get(idx));
            A.set(idx,tmp);
        }
        System.out.println(A.get(B-1));
        return A.get(B - 1);
    }*/

        //via array
        for (int i = 0; i < B; i++) {
            int minn = Integer.MAX_VALUE, idx = 0;
            for (int j = i; j < A.length; j++) {
                if (A[j] < minn) {
                    minn = A[j];
                    idx = j;
                }
            }
            int tmp = A[i];
            A[i] = A[idx];
            A[idx] = tmp;
        }
        return A[B - 1];

    /*
        normal way
        using Collections.sort(A)
        return A.get(B-1)
     */


    }
}

