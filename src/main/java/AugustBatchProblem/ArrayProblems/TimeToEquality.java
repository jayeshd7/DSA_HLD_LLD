package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;
import java.util.Collections;

public class TimeToEquality {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(3);
        al.add(2);

        timeToEqaulity(al);
    }

    private static int timeToEqaulity(ArrayList<Integer> al) {

        int ans = 0;
        Collections.sort(al);
        int maxValue = al.get(al.size()-1);
        for(int i =0; i<al.size()-1;i++){
            int value = maxValue - al.get(i);
            ans = ans + value;
        }
        System.out.println(ans);
        return ans;
    }
}
