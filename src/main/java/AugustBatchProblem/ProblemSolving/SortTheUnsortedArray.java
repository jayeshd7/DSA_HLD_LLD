package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheUnsortedArray {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);al.add(1);
        al.add(15);al.add(25);al.add(6);al.add(7);al.add(30);al.add(40);al.add(50);
        System.out.println(solve(al));
    }

    public static int solve(ArrayList<Integer> A) {
        ArrayList<Integer> copy = new ArrayList<>();
        copy.addAll(A);
        Collections.sort(copy);


        int n = A.size();
        int start = 0; int end =n-1;


        while(start < end){
            if(A.get(start).equals(copy.get(start)) ){
                start++;
            }else break;
        }
        while(end > start){
            if(A.get(end).equals(copy.get(end) )){
                end--;
            }else break;
        }


        return (end-start+1);
    }
}
