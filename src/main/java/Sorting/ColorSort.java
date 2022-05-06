package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {

    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(0);al.add(1);al.add(2);al.add(0);al.add(0);al.add(1);al.add(2);
        solve(al);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
       int countZero = 0 ;
       int countOnce = 0;
       int countTwo = 0;
       for(int i =0;i<A.size();i++){
           if(A.get(i) == 0){
               countZero++;
           }
           else if(A.get(i) ==1 ){
               countOnce++;
           }
           else if(A.get(i) == 2){
               countTwo++;
           }
       }


       ArrayList<Integer> x = new ArrayList<>();

       for(int i =0;i<countZero;i++) {
          x.add(0);

       }
       for(int i =x.size()+1;i<A.size()-countTwo+1;i++){
           x.add(1);
       }
       for(int i =x.size()+1;i<A.size()+1;i++){
           x.add(2);
       }



        return x;


    }
}
