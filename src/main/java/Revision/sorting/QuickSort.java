package Revision.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int size = arr.length;
        quickSortRevision(arr,0,size-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
}

    private static void quickSortRevision(int[] arr,int lower, int upper) {
        if(lower>= upper){
            return;
        }
        int pivot = arr[lower];
        int start = lower;
        int end = upper;

        while(lower<upper){
            while (arr[lower]<= pivot && lower< upper){ lower++;}
            while (arr[upper]> pivot && lower <= upper){ upper --;}
            if(upper> lower) swapValue(arr, upper, lower);
        }
        swapValue(arr, upper, start);
        quickSortRevision(arr, start, upper-1);
        quickSortRevision(arr, upper+1, end);
    }

    private static void swapValue(int[] arr, int upper, int lower) {
        int temp = arr[upper];
        arr[upper] = arr[lower];
        arr[lower] = temp;
    }
}
