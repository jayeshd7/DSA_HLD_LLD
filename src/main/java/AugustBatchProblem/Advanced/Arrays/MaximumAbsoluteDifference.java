package AugustBatchProblem.Advanced.Arrays;

public class MaximumAbsoluteDifference {

    public static void main(String[] args) {
        int [] A = {1, 3, -1};
        System.out.println(solve(A));
    }

    private static int solve(int[] a) {

        int n = a.length;
        int xmax = Integer.MIN_VALUE;
        int xmin = Integer.MAX_VALUE;
        int ymax = Integer.MIN_VALUE;
        int ymin = Integer.MAX_VALUE;

        for(int i =0; i<n;i++){

            xmax = Math.max(xmax, a[i]+i);
            xmin = Math.min(xmin, a[i]+i);
            ymax = Math.max(ymax,a[i]-i);
            ymin = Math.min(ymin,a[i]-i);


        }
        return  (Math.max(xmax-xmin, ymax-ymin));

    }
}
