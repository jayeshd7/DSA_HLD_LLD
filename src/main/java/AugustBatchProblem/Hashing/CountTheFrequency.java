package AugustBatchProblem.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountTheFrequency {
    public static void main(String[] args) {
        int [] A = {10, 5, 3, 4, 3, 5, 6};

        solve(A);
    }

    private static int solve(int [] A) {
        int value1 = 0;
        int n = A.length;
        HashMap<Integer, Integer> hashMap = new HashMap();

        for(int i=0;i<n;i++){
            if(hashMap.containsKey(A[i])){
                int value = hashMap.get(A[i]);
               hashMap.put(A[i], value+1);
            }
            else{
                hashMap.put(A[i],1);
            }
        }
        hashMap.entrySet()
                .forEach((entry) -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        System.out.println(hashMap);
        //System.out.println(hashMap.keySet().stream().findFirst().get());
        return value1;
    }



    static Boolean subArrayExists(int arr[])
    {

        Set<Long> hs = new HashSet<Long>();
        long sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if (arr[i] == 0
                    || sum == 0
                    || hs.contains(sum))
                return true;

            hs.add(sum);
        }

        return false;
    }
}
