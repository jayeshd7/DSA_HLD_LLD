package Revision.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int size = arr.length;
        insertionSort(arr, size);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static boolean less(int first, int second) {
        return first < second;
    }

    private static boolean more(int first, int second) {
        return first > second;
    }

    private static void insertionSort(int[] arr, int size) {
        int temp, j;
        for(int i = 1; i<size;i++){
            temp = arr[i];
            for(j = i; j>0 && more(arr[j-1], temp); j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
    }
}
