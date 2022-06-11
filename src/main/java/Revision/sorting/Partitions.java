package Revision.sorting;

public class Partitions {
    public static void main(String[] args) {
        int [] arr = {0,1,1,1,0, 0, 1};
        int size = arr.length;
        partitionof(arr, size);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void partitionof(int[] arr, int size) {

        int left = 0;
        int right = size-1;
        int count = 0;
        while (left<right){
            while(arr[left] == 0){
                left +=1;
            }
            while(arr[right] == 1){
                right -= 1;
            }
            if(left< right){
                swapvalues(arr, left, right);
                count++;
            }
        }

    }

    private static void swapvalues(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
