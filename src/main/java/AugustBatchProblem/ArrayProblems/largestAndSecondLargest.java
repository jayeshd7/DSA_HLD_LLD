package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class largestAndSecondLargest {
    public static void main(String[] args) {
        int sizeOfArray = 5;
        int arr [] = {1,2,3,4,5};
        System.out.println(largestAndSecondLargest1(sizeOfArray, arr));

    }

    public static ArrayList<Integer> largestAndSecondLargest1(int sizeOfArray, int arr[])
    {
        //code here.


        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        //Iterating through the array and comparing the elements
        // to find max and second max.
        for(int i = 0;i<sizeOfArray; i++){

            //If current element is greater than max, we update the max and second max.
            //second max becomes equal to max and max becomes equal to the current element.
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            }
            //Else If current element is greater than max2 and is not equal to max.
            //we update second max as current element.
            else if(arr[i] > max2 && arr[i] != max){
                max2 = arr[i];
            }
        }

        //If no second max exists, we assign -1 to second max.
        if(max2 == Integer.MIN_VALUE){
            max2 = -1;
        }

        //returning the max and second max element.
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(max);
        res.add(max2);
        return res;
    }

}