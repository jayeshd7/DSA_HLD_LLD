package AugustBatchProblem.Day1;

import java.util.Arrays;

public class RepeatandMissingNumber {
    public static void main(String[] args) {
        int arr[] = { 9,8,7, 3, 4, 6,1, 1, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
    }

    private static void printTwoElements(int[] arr, int n) {
        int i;
        int Expectedsum = n*(n+1)/2;
        System.out.println("Expectedsum" + Expectedsum);
        int actualSum =0;
        for (i = 0; i < n; i++){
            actualSum +=  arr[i];

        }
        System.out.println("actual sum" +actualSum);
        int actualmissingNumber = Expectedsum - actualSum;
        Arrays.sort(arr);
        int repetativeNumber = 0;
        for(int j = 0;j <n-1;j++){
            if(arr[j]==arr[j+1]){
                repetativeNumber = arr[j];
            }
        }
        System.out.println("repetativeNumber is :" + repetativeNumber);
        System.out.println("ExpectedmissingNumber" +(actualmissingNumber + repetativeNumber));
    }
}
