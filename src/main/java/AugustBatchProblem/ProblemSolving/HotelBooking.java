package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBooking {

    public static void main(String[] args) {
        ArrayList<Integer>arrive = new ArrayList<>();
        ArrayList<Integer>departure = new ArrayList<>();
        arrive.add(1);arrive.add(2);arrive.add(3);
        departure.add(2);departure.add(3);departure.add(4);
        int k= 1;
        System.out.println(hotel(arrive,departure,k));
    }
    public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);

        for(int i =0; i<arrive.size();i++){
            if(arrive.get(i)>depart.get(0)){
                depart.remove(0);
            }
        }
        return depart.size()<=K ? true :false;
    }
}

// 1 2 3
// 2 3 4

// k = 1

/*
 1 - 2
 2 -
 */
