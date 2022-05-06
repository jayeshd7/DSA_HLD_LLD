package AugustBatchProblem.ArrayProblems;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        solve(a);
    }

    private static void solve(int [] a) {

        int temp = a[0];
        for(int i =1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1] = temp;

        for(int j = 0; j< a.length;j++){
            System.out.println(a[j]);
        }
    }

}
