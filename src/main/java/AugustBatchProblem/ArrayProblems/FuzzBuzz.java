package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class FuzzBuzz {

    public static void main(String[] args) {
        int n = 15;
        fizzBuzz(n);
    }

    private static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> al = new ArrayList<>();

        for(int i = 1;i <=n ;i++ ){
            if((((i % 3) == 0) && ((i % 5) == 0))){
                al.add("FizzBuzz");
            }
            else if (i % 3 == 0){
                al.add("Fizz");
            }
            else if (i  % 5 == 0){
                al.add("Buzz");
            }

            else {
                al.add(String.valueOf(i));
            }
        }


        System.out.println(al);
        return al;
    }
}
