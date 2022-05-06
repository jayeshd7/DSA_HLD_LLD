package AugustBatchProblem.Advanced.Arrays;

public class FirstMissingInteger {

    public static void main(String[] args) {
        int [] A = {2, 5, 1, 4};
        System.out.println(solve(A));

    }

    private static int solve(int[] A) {

        for(int i=0; i<A.length; i++){
            while(A[i]>=1 && A[i]<A.length+1 && A[i]!=A[A[i]-1]){
                int temp=A[A[i]-1];
                A[A[i]-1]=A[i];
                A[i]=temp;
            }
        }

        for(int j=0; j<A.length; j++){
            if(A[j] != j+1){
                return j+1;
            }
        }
        return A.length + 1;
    }
    }

