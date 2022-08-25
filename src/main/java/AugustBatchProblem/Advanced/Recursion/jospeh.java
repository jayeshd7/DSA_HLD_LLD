package AugustBatchProblem.Advanced.Recursion;

public class jospeh {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println(jospehProblem(n,k));
    }

    private static int jospehProblem(int n, int k) {

        if(n == 1) return 1;
        return (jospehProblem(n-1,k) + k)%n;
    }
}
