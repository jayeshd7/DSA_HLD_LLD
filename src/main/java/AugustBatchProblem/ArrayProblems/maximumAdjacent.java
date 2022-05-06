package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class maximumAdjacent {

    public static void main(String[] args) {
        int arr [] = {1,2,2,3,4,5};
        int sizeOfArray = arr.length;
        maximumAdjacent1(sizeOfArray, arr );

    }

    private static void maximumAdjacent1(int sizeOfArray, int arr[]) {
        ArrayList arrayList = new ArrayList<Integer>();

        for (int i =1; i<sizeOfArray;i++){
            int r = Math.max(arr[i], arr[i-1]);
           arrayList.add(r);

        }


        for(int j =0;j<sizeOfArray-1;j++){
            System.out.print(arrayList.get(j) + " ");
        }
        System.out.println(arrayList);

        StringBuffer sb = new StringBuffer();

        // Iterating through all window of size two.
        for(int i = 0, j = 1;i<sizeOfArray-1 && j < sizeOfArray;i++, j++){
            //Appending the maximum between two adjacent elements.
            sb.append(Math.max(arr[i], arr[j]) + " ");
        }
        //Printing the maximum for every adjacent pairs in the array.
        System.out.print(sb);
    }
}
