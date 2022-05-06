package AugustBatchProblem.RandomProblems;

public class MaxDifference {

    public static void main(String[] args) {
        int arr [] = {2,3,10,6,4,8,1};
        int n = arr.length;
        int m = maxDifference(arr, n); //o(n^n)
        System.out.println("difference is "+ m);
        int p = efficientSolution(arr, n);//o(n)
        System.out.println("effieent way difference is "+ p);



    }

    private static int efficientSolution(int[] arr, int n) {

        int res = arr[1]- arr[0];
        int minValue = arr[0];

        for(int j =1;j<n;j++){
            res = Math.max(res,arr[j]-minValue);
            minValue = Math.min(arr[j],minValue);
        }

        return res;
    }

    //o(n^n)
    private static int maxDifference(int[] arr, int n) {
        int res = arr[1] - arr[0];
        for(int i = 0; i < n-1;i++){
            for(int j = i+1; j<n ;j++){
                res = Math.max(res, arr[j]-arr[i]);
            }
        }
        return res;
    }
}
