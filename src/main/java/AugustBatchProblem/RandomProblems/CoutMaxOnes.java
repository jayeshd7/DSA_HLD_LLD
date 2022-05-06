package AugustBatchProblem.RandomProblems;

public class CoutMaxOnes {

    public static void main(String[] args) {

        int arr[] = {0,1,1,0,1,0,0};
        int n = arr.length;
        int values = maxOnces(arr, n);
        System.out.println("count of 1 is "+ values);

    }



    private static int maxOnces(int[] arr, int n) {
        int res = 0;
        int count =0;
        for(int i =0;i<n;i++){
         if (arr[i]==0){
             count =0;
         }
         else{count++;}
         res = Math.max(res,count);
        }
        return res;
    }



}
