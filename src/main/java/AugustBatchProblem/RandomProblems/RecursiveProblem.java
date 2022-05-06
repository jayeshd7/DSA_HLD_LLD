package AugustBatchProblem.RandomProblems;

public class RecursiveProblem {

    public static void main(String[] args) {
        reverseRecursive(5);
        forwardRecursive(5);


    }

    private static void forwardRecursive(int i) {
        if(i==0) return;
        forwardRecursive(i-1);
        System.out.println(i);
    }

    private static void  reverseRecursive(int n) {
        if(n==0) return ;
        System.out.println(n);
        reverseRecursive(n-1);
    }



}
