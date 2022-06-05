package Revision.sorting;

public class BubbleSortImprovedPerformance {

    public static void main(String[] args) {
        int [] arr = {9,1,8,2,7,3,6,4,5};
        int size = arr.length;
        bubbleSort(arr, size);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    private static boolean less (int first, int second){
        return first<second;
    }

    private static boolean more(int first, int second){
        return first>second;
    }

    private static void bubbleSort(int[] arr, int size) {
        int i , j , temp, swapped = 1;
        for(i = 0; i<(size-1) && swapped == 1;i++){
            for (j = 0; j<(size-i-1) ; j++){
                swapped = 0;
                if(more(arr[j],arr[j+1])){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped =1;
                }
            }
        }

    }
}
