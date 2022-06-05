package Revision.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int size = arr.length;
        //selectionSortUsingMin(arr, size);
        selectionSortUsingMax(arr, size);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void selectionSortUsingMin(int[] arr, int size) {
        int temp, min;
        for(int i = 0; i<size-1;i++){
           min = i;

           for(int j = i+1; j<size;j++){
               if(arr[j]<arr[min]){
                   min = j;
               }
           }
           temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
        }
    }

    private static void selectionSortUsingMax(int[] arr, int size) {
        int temp, max;
        for(int i = size-1; i>0;i--){
            max = size-1;

            for(int j = 1; j<size-1;j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            temp = arr[size-1-i];
            arr[size-1-i] = arr[max];
            arr[max] = temp;
        }
    }

    private static boolean less(int first, int second) {
        return first < second;
    }

    private static boolean more(int first, int second) {
        return first > second;
    }

}
