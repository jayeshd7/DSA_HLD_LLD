package AugustBatchProblem.Day1;

public class problem4 {

    public static void main(String[] args) {
        int n = 143;
        for(int i = 1; i<n; i++){
            if( i*i > n){
                System.out.println(i-1);
                break;
            }
        }
    }
}
