package AugustBatchProblem.Advanced.Arrays;

public class AbsoluteMaximum {

    public static void main(String[] args) {

        int [] A = {-14, -46, -16, -4, -20};
        int []B = {-29, -46, -38, -15, -13};
        int []C = {-11, -34, -9, -43, -24};
        int [] D = {-29, -13, -43, -36, -15};

        System.out.println(solve(A,B,C,D));

    }

    private static int solve(int[] a, int[] b, int[] c, int[] d) {
        int sum = Integer.MIN_VALUE;

        for(int i =0;i<a.length-1;i++){
            for(int j =1;j<a.length;j++) {
                int sum1 = Math.abs(a[i] - a[j]);
                int sum2 = Math.abs(b[i] - b[j]);
                int sum3 = Math.abs(c[i] - c[j]);
                int sum4 = Math.abs(d[i] - d[j]);
                int indexSum = Math.abs(i - (j));

                int actualSum = Math.abs(sum1 + sum2 + sum3 + sum4 + indexSum);

                sum = Math.max(sum, actualSum);


            }
        }
            return sum;

    }
}
