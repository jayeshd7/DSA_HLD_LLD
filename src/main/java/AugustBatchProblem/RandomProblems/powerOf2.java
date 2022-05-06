package AugustBatchProblem.RandomProblems;

public class powerOf2 {

    public static void main(String[] args) {
        int x = 1;

        if((x & (x-1)) == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
