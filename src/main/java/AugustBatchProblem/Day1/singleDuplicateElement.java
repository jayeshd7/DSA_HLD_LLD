package AugustBatchProblem.Day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class singleDuplicateElement {
    //link - https://leetcode.com/problems/find-the-duplicate-number/solution/

    public static void main(String[] args) {
        int arr[] = {1,2,4,4,3,3,5};
        //Approach -1
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i =0;i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("duplicats are :" + arr[i]);
            }
        }

        //Approach -2
        Set seen  = new HashSet<Integer>();
        for(int num :arr){
            if(seen.contains(num)){
                System.out.println("duplicates are :" + num);
            }
            seen.add(num);
        }
    }
}
