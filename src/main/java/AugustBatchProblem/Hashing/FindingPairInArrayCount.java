package AugustBatchProblem.Hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class FindingPairInArrayCount {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(7);
        al.add(6);
        solve(al);

        /*
            3,4 - 7
            4,2 - 6
            2,7 - 9
         */
    }

    private static int solve(ArrayList<Integer>al) {

        HashSet<Integer> hs = new HashSet<>();
        int n = al.size();

        for(int i:al){
            hs.add(i);
        }
        boolean found = false;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = al.get(i) +al.get(j);
                if (hs.contains(sum)) {
                    found = true;
                    count++;

                }
            }
        }
        if(found == true){
            System.out.println(count);
            return count;
        }

        if (found == false){
            System.out.println(count);
            return 0;
        }
        return count;
    }
    }

