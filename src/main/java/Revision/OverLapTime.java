package Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OverLapTime {

    public static void main(String[] args) {
        ArrayList<Double> A = new ArrayList<>();
        ArrayList<Double> B = new ArrayList<>();
        ArrayList<Double> C = new ArrayList<>();
        ArrayList<Double> D = new ArrayList<>();
        A.add(9.0);A.add(10.0);
        B.add(9.0);B.add(11.0);
        C.add( 2.40);C.add(3.0);
        D.add(3.0);D.add( 4.30);
        ArrayList<ArrayList<Double>>input = new ArrayList<>();
        input.add(A);input.add(B);input.add(C);input.add(D);

       System.out.println(overLapTime(input));
    }

    private static List<List> overLapTime(ArrayList<ArrayList<Double>> input) {
        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        for(int i = 0; i<input.size(); i++){
            for(int j = i+1; j<input.size(); j++){
              if(input.get(i).get(1)>=input.get(j).get(0) && input.get(i).get(0)<=input.get(j).get(0)){
                    result.add(new ArrayList<>(List.of(input.get(i).get(0),input.get(j).get(1))));
              }
            }
        }
        return Collections.singletonList(result);
    }
}
