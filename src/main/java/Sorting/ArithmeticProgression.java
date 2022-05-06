package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArithmeticProgression {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(6);
        solve(al);

    }

    public static int solve(ArrayList<Integer> A) {

        Collections.sort(A);

        if (A.size() == 1)
            return 1;

        int d = A.get(1)- A.get(0);
        for (int i = 2; i < A.size(); i++)
            if (A.get(i) - A.get(i-1) != d)
                return -1;

        return 1;


    }
}
