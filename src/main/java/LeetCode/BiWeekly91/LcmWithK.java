package LeetCode.BiWeekly91;


public class LcmWithK {
    public static void main(String[] args) {
        int[] arr = {3,6,2,7,1};
        int k = 6;
        System.out.println(findLCM(arr, k));
    }

    private static int findLCM(int[] arr, int k) {
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i<n;i++){
            int currLcm = 1;
            for(int j = i; j<n;j++){
                currLcm = createLcm(currLcm, arr[j]);
                ans += (currLcm == k) ?1 :0;
            }
        }
        return ans ;
    }

    private static int createLcm(int a, int b) {
        return (a*b)/createGcd(a, b);

    }

    private static int createGcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return createGcd(b, a%b);
    }
}
