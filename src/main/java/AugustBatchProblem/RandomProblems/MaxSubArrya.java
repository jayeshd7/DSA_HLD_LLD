package AugustBatchProblem.RandomProblems;

public class MaxSubArrya {

    public static void main(String[] args) {


        int arr [] = {1,-2,3,2,1,1};
        int n = arr.length;

        int values = findmaxSumSubArray(arr, n); //O(n^n)
        System.out.println(values);

        int val = findMaxsumbyEfficientWay(arr,n);
        System.out.println(val);
    }

    private static int findMaxsumbyEfficientWay(int[] arr, int n) {


        int res = arr[0];
        int maxEnding = arr[0];
        for(int i =0;i<n;i++){
            maxEnding = Math.max(maxEnding + arr[i],arr[i]);
            res = Math.max(maxEnding,res);
        }
        return res;
    }

    private static int findmaxSumSubArray(int[] arr, int n) {

        int res = arr[0];
        for (int i =0;i<n;i++){
            int curr =0;
            for(int j =i;j<n;j++){
                curr = curr + arr[j];
                res = Math.max(res,curr);

            }
        }
        return res;
    }

}
