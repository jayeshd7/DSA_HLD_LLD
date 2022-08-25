package AugustBatchProblem.Revision;

import java.util.ArrayList;

public class PrintAllSubset {
    public  static  final ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String s = "abc";
        int i = 0;

        subSetSolve(s, i, "");
    }

    private static void subSetSolve(String s,int i,String curr ) {

        if(i == s.length()){
            list.add(curr);
            System.out.println(list);
            return;
        }
        subSetSolve(s,i+1, curr + s.charAt(i));
        subSetSolve(s,i+1,curr);
    }
}
