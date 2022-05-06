package AugustBatchProblem.RandomProblems;

public class MaxLengthEvenOdd {

    public static void main(String[] args) {
        int arr [] = {2,10,7,6,3,8};
        int n = arr.length;

        int m = findMaxLengthEvenOdd(arr, n);
        System.out.println("values is "+ m);
    }

    private static int findMaxLengthEvenOdd(int[] arr, int n) {

        int res = 1;
        for(int i =0;i<n;i++){
            int curr = 1;
            for (int j = i+1;j<n;j++){
                if ((arr[j] %2 == 0 && arr[j-1] %2 !=0) || (arr[j] %2 != 0 && arr[j-1] %2 ==0)){
                 curr++;
                }
                else{break;}

            }
            res = Math.max(res,curr);
        }
        return res;
    }
}
