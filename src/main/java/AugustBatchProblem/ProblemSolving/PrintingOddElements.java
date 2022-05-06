package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class PrintingOddElements {

    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(2);al.add(3);al.add(4);
        System.out.println(solve(al));
    }

    private static ArrayList<Integer> solve(ArrayList<Integer> A) {
        if(A.size() % 2 == 1){
            A.remove(A.size()-1);
        }
        ArrayList<Integer>x = new ArrayList<>();
        for(int i =0; i<A.size();i+=2){
            for(int j = 0;j<A.get(i);j++){
                x.add(A.get(i+1));
            }
        }
        return x;

    }
}

/*
map, e
{d,c,b}
{a:b
b:c
c:d
d:none
e:b
}
 */