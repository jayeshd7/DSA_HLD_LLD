package AugustBatchProblem.RandomProblems;

public class ReverseArray {

    public static void main(String[] args) {
        int arr [] = {1,2,4};
        int n = arr.length;
       reverseArray(arr,n);
       for(int i =0;i<n;i++){
           System.out.println(arr[i]);
       }
    }

    public static void reverseArray(int arr[],int n){
        int i;
        int low =0;
        int high = n-1;
       while(low<high) {
           int tmp = arr[low]; //tmp =4
           arr[low] = arr[high]; // low = 4
           arr[high] = tmp; //high =
           low++;
           high--;


       }
    }
}
