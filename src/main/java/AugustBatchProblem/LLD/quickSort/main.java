package AugustBatchProblem.LLD.quickSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int n = array.length;
        ThreadedQuick threadedQuick = new ThreadedQuick(1, array,0,n);
        ExecutorService executorService = Executors.newCachedThreadPool();

        try {
            Future<List<Integer>> sortedList = (Future<List<Integer>>) executorService.submit(threadedQuick);
            List<Integer> sorted = sortedList.get();
            System.out.println(sorted);
        } catch (Exception e) {
            System.out.println("Something is wrong");
        }


    }
}
