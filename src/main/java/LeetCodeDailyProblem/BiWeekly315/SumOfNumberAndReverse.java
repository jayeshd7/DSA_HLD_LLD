package LeetCodeDailyProblem.BiWeekly315;

public class SumOfNumberAndReverse {
    public static void main(String[] args) {
        int n= 181;
        System.out.println(sumOfNumberAndReverse(n));
    }

    static boolean sumOfNumberAndReverse(int n) {
        for(int i = 0; i<=n;i++){
            int sum = i+reverse(i);
            if(sum==n){
                return true;
            }
        }
        return false;
    }

    public static int reverse(int i) {
        int ans = 0;
        while(i>0){
            int rem = i%10;
            ans = ans*10+rem;
            i = i/10;
        }
        return ans;
    }
}
