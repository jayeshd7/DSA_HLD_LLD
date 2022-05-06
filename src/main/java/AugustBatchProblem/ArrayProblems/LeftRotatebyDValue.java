package AugustBatchProblem.ArrayProblems;

public class LeftRotatebyDValue {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int d = 2;
        int n = a.length;
        //solve(a,n,d);
        //method -2
        //solve1(a,n,d); //o(n)- TC , o(d) - auxillary space
        //method -3
        solve2(a,n,d); //o(n) - TC , o(1) - auxillary space


    }

    private static void solve2(int[] a, int n, int d) {
        reverse(a, 0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
        for(int j = 0; j< n;j++){
            System.out.println(a[j]);
        }
    }

    private static void reverse(int[] a, int low, int high) {

        while(low<high){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;

            low++;
            high--;
        }
    }

    private static void solve1(int[] a, int n, int d) {
        int temp [] = new int[d];

        for(int i =0;i<d;i++){
            temp[i] = a[i];
        }
        for(int i =d;i<n;i++){
            a[i-d] =a[i];
        }
        for(int i =0;i<d;i++){
            a[n-d+i] = temp[i];
        }
        for(int j = 0; j< n;j++){
            System.out.println(a[j]);
        }
    }

    // counterclock wise via one rotation at a time.
    private static void solve(int [] a,int n,  int d) {

        for(int i =0;i<d;i++){
            leftRotate(a, n);

        }
        for(int j = 0; j< n;j++){
            System.out.println(a[j]);
        }

    }

    private static void leftRotate(int[] a, int n) {
        int temp = a[0];
        for(int i =1;i<n;i++){
            a[i-1]=a[i];
        }
        a[n-1] = temp;


    }
    }

