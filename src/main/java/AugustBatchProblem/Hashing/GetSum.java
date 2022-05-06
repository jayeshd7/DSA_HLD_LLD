package AugustBatchProblem.Hashing;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GetSum {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(3);
        A.add(3);


        int n = A.size();
        int k = 2;

        // Function call
        print_N_mostFrequentNumber(A, n, k);

    }

    static int print_N_mostFrequentNumber(ArrayList<Integer> arr,
                                           int n,
                                           int k)
    {

        Map<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            mp.put(arr.get(i),
                    mp.getOrDefault(arr.get(i), 0) + 1);
        }
        mp.forEach((key, value) -> {
            if (value.equals(k)) {

                al.add(key);
            }
        });
        if(al.isEmpty()){
            return -1;
        }
        int result = 0;
        for (int i: al) {
            result += i;
        }
        System.out.println("result is" + result);
        return result;
    }
}

