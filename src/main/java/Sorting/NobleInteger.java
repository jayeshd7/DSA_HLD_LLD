package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);al.add(2);al.add(1);al.add(3);//al.add(-6);
        solve(al);
    }

    //1,1,1,3

    private static int solve(ArrayList<Integer> A) {

        Collections.sort(A);
        Collections.reverse(A);
        int l =A.size();
        for(int i=0; i<l ;i++){
            if(A.get(i)==i){
                if(i!=0 && A.get(i)!=A.get(i-1)){
                    System.out.println(i);
                    return 1;
                }
                else if(i==0){
                    return 1;

                }

            }
        }
        return -1;

    }
}
