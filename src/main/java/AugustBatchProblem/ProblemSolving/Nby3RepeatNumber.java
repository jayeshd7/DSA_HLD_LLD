package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.HashMap;

public class Nby3RepeatNumber {

    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(2);al.add(4);al.add(3);al.add(1);al.add(1);

        System.out.println(solve(al));
    }

    private static int solve(ArrayList<Integer> a) {
        int n = a.size();
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            int x = a.get(i), ans = 0;
            if(h.containsKey(x)){
                ans = h.get(x);
                h.put(x, ans + 1);
                ans++;

            }else{
                h.put(x, 1);
                ans = 1;
            }
            if(ans > n / 3){
                return x;
            }
        }
        return -1;


    }
}
