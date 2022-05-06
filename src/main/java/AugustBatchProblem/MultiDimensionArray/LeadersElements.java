package AugustBatchProblem.MultiDimensionArray;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersElements {

    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        int size = A.length;
        solve(A,size );
    }

    private static  ArrayList<Integer> solve(int[] arr, int n) {
        int maxEle = arr[n-1];

        ArrayList<Integer> res = new ArrayList<>();

        //We start traversing the array from last element.
        for(int i=n-1; i>=0; i--) {

            //Comparing the current element with the maximum element stored.
            //If current element is greater than max, we add the element.
            if(arr[i] >= maxEle){
                //Updating the maximum element.
                maxEle = arr[i];
                //Storing the current element in arraylist for leaders.
                res.add(maxEle);
            }
        }

        //Reversing the arraylist.
        Collections.reverse(res);
        //returning the arraylist.
        System.out.println(res);
        return res;



    }
}
