package Revision;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int [] a = {-5,-4,-2,-6,-1};
        int maxSum = 0;
        int currSum = 0;
        for(int i = 0; i<a.length;i++) {
            currSum = currSum + a[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }

        }
        System.out.println(maxSum);
    }
}
