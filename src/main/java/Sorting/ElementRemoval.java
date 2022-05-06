package Sorting;



import java.util.ArrayList;
import java.util.Collections;


public class ElementRemoval {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(3);al.add(0);al.add(9);al.add(7);al.add(8);
        solve(al);

    }

    private static int solve(ArrayList<Integer> A) {

        int cost = 0;

        Collections.sort(A);
        //Collections.reverse(A);

        if(A.size() ==1){

            return A.get(0);
        }
        // 0,8,10

        for(int j =A.size();j>0;j--) {
            for (int i = 0; i < A.size(); i++) {
                cost += A.get(i);
            }
            A.remove(A.size()-1);
        }

        System.out.println(cost+1);
        return cost;
    }
}
