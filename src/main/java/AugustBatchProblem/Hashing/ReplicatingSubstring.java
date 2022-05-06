package AugustBatchProblem.Hashing;

import java.util.HashMap;

public class ReplicatingSubstring {

    public static void main(String[] args) {
        int A = 3;
        String B = "abbabbabb";

        /*
        *
        * abbabbabb
        *
         */

        solve(A,B);
    }

    private static int solve(int A, String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, (val + 1));
            }
            else {
                map.put(c, 1);
            }
        }
        System.out.println(map);

        long count = map.values().stream().filter(i -> i%A !=0).count();

        if(count == 0){
            return 1;
        }
        else{
            System.out.println("-1");
            return -1;
        }

    }
}

