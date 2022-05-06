package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(1);al.add(1);al.add(2);
        System.out.println(solve(al));
    }

    private static ArrayList<Integer> solve(ArrayList<Integer> a) {

        int i = 0;
        for (int j = 1; j < a.size(); j++)
            if (!a.get(i).equals(a.get(j)))
                a.set(++i, a.get(j));

        while (a.size() > i + 1)
            a.remove(a.size() - 1);

        return a;
    }
}
