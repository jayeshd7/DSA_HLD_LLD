package AugustBatchProblem.Advanced.TwoPointer;

public class PairswithgivensumII {
    private static final long mod = 1000000007;
    public static void main(String[] args) {
        int [] A = {1, 1, 3, 3, 5, 5, 6, 6, 6, 9, 10};
        System.out.println(solvePairswithgivensumII(A, 9));
    }

    private static int solvePairswithgivensumII(int[] a, int B) {
        int i = 0;
        int j = a.length-1;
        int ans=0;
        while(i<j)
        {
            int sum=a[i]+a[j];
            if(sum>B)
                j--;
            else if(sum<B)
                i++;
            else
            {
                if(a[i] == a[j]){
                    int x = j-i+1;
                    int v = x*(x-1);
                    ans += ((v/2) % mod);
                    break;
                }
                else {
                    int a1 = a[i];
                    int a2 = a[j];
                    int ci = 0; int cj =0;
                    while (i<a.length && a[i] == a1){
                        i++;
                        ci++;
                    }
                    while (j<a.length && a[j] == a2){
                        j--;
                        cj++;
                    }

                    ans = (int) ((ans %mod) + ((cj*ci)%mod)%mod);
                }
            }
        }
        return (int) (ans%mod) ;
    }
}
