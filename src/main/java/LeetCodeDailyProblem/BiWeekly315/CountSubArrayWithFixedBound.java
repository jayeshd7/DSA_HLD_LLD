package LeetCodeDailyProblem.BiWeekly315;

public class CountSubArrayWithFixedBound {
    public static void main(String[] args) {
        int [] input = {1,3,5,2,7,5};
        int n = input.length;
        int minK = 1;
        int maxK = 5;
        System.out.println(countSubArrayWithFixedBound(input,n, minK, maxK));
    }

    private static long countSubArrayWithFixedBound(int[] input, int n, int minK, int maxK) {
        long ans = 0;
        int minI = -1;
        int maxI = -1;
        int startI = 0;


        for(int i = 0; i<n;i++){
            if(input[i]<minK || input[i]>maxK){
                minI = maxI = -1;
                startI = i+1;
            }
            if(input[i] == minK){
                minI = i;
            }
            if(input[i] == maxK){
                maxI = i;
            }
            ans = ans + Math.max(0L,Math.min(minI,maxI)-startI+1);
        }
        return ans;
    }
}
