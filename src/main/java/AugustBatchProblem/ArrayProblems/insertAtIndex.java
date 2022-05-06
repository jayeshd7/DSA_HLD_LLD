package AugustBatchProblem.ArrayProblems;

import java.util.Arrays;

public class insertAtIndex {

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int sizeOfArray = arr.length;
        int index = 0;
        int element = 5;
        insertAt(arr,sizeOfArray,index, element  );
    }

    public static void insertAt(int arr[], int sizeOfArray, int index, int element)
    {

        if(index==sizeOfArray-1)
        {
            arr[index]=element;
            return;
        }
        //if given index is not last index we need to shift all the elements starting
        //from that index to the last element towards right by 1 position.
        arr[sizeOfArray-1] = -1;

        //we iterate from last index to the index given.
        for(int i=sizeOfArray-1;i>index;i--)
        {
            //we simply swap the values at ith and (i-1)th index in the array.
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        //Then we insert the given element at given index.
        arr[index]=element;
        System.out.println(Arrays.toString(arr));
    }


}
