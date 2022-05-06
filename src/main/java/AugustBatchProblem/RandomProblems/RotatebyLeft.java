package AugustBatchProblem.RandomProblems;

public class RotatebyLeft {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int d =2;

        rotateleft(arr,n,d);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    private static void rotateleft(int[] arr, int n, int d) {
        for(int i =0;i<d ;i++){
            rotateleftbyOne(arr,n);
        }
    }

    private static void rotateRight(int[] arr, int n) {
        int temp = arr[n-1];
        for(int i =0;i<n-1;i++){
            arr[i+1]=arr[i];
        }


        arr[0] = temp;

    }

    private static void rotateleftbyOne(int[] arr, int n) {
        int temp = arr[0];
        for(int i =1;i<n;i++){
            arr[i-1] = arr[i];

        }
        arr[n-1]=temp;
    }
}
