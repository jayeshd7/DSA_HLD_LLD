package AugustBatchProblem.Advanced.Hashing;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumber {

    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4);
        solveSumOfAllNumber(list);
    }

    private static int solveSumOfAllNumber(List<Integer> list) {
        int sum = 0;
        for(int i =0; i<list.size();i++){
            sum += list.get(i);

        }
        Integer value = list.stream().reduce(0,(b,a) -> (b+a));
        System.out.println(value);
        return sum;
    }
}
