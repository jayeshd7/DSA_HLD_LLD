package AugustBatchProblem.RandomProblems;

public class findIndex {

    public static int findIndex(int arr[], int x, int n){
        for(int i=0 ; i <= arr.length; i++){
            if(arr[i] == 5){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr []  = {1,2,3,4,5};
        int x = 5;
        int n = arr.length;
        System.out.println(findIndex(arr,x,n));


    }
}
