package Revision.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int size = arr.length;
        int [] tempArr = new int[size];
        mergeSortRevision(arr, tempArr, 0, size-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void mergeSortRevision(int[] arr, int [] tempArr, int lowerIndex, int upperIndex) {
    if(lowerIndex >= upperIndex){
        return;
    }
    int midddlIndex = (lowerIndex + upperIndex)/2;
        mergeSortRevision(arr, tempArr, lowerIndex,midddlIndex);
        mergeSortRevision(arr, tempArr, midddlIndex+1, upperIndex);
        mergesrt(arr, tempArr, lowerIndex, midddlIndex, upperIndex);

    }

    private static void mergesrt(int[] arr, int[] tempArr, int lowerIndex, int midddlIndex, int upperIndex) {
        int lowerStart = lowerIndex;
        int lowerStop = midddlIndex;
        int upperStart = midddlIndex+1;
        int upperStop = upperIndex;
        int count = lowerIndex;

        while(lowerStart<= lowerStop  && upperStart <= upperStop){
            if(arr[lowerStart]<arr[upperStart]){
                tempArr[count++] = arr[lowerStart++];
            }
           else {
                tempArr[count++] = arr[upperStart++];
            }
        }
        while (lowerStart<= lowerStop){
            tempArr[count++] = arr[lowerStart++];
        }
        while (upperStart<= upperStop){
            tempArr[count++] = arr[upperStart++];
        }
        for(int i =lowerIndex; i<=upperIndex;i++){
            arr[i] = tempArr[i];
        }


    }
}
