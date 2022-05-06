package AugustBatchProblem.MultiDimensionArray;

public class MaximumLengthEvenOdd {

    public static void main(String[] args) {
        int []a = {5,5,6,7};
        //solve(a);
        cadenseAlgo(a);
    }

    private static int cadenseAlgo(int[] arr) {
        int res = 1;
        int curr =1;
        for(int j =1; j<arr.length;j++){
            if((arr[j] %2 == 0 && arr[j-1]%2  !=0) || (arr[j]%2 !=0 && arr[j-1]%2 ==0)){
                curr++;
                res = Math.max(res, curr);
            }
            else
                curr =1;
        }
        System.out.println(res);
        return res;
    }

    private static int solve(int [] arr) {
        int res = 1;
        for(int i =0; i<arr.length;i++){
            int curr = 1;
            for(int j=i+1;j<arr.length;j++){
                if((arr[j] %2 == 0 && arr[j-1]%2  !=0) || (arr[j]%2 !=0 && arr[j-1]%2 ==0)){
                    curr++;
                }
                else
                    break;
            }
            res = Math.max(curr, res);
        }
        System.out.println(res);
        return res;
    }
}
