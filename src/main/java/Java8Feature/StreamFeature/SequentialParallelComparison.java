package Java8Feature.StreamFeature;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialParallelComparison {

    public static void main(String[] args) {
        String [] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        run(Arrays.stream(strings).sequential());
        run(Arrays.stream(strings).parallel());
    }

    private static void run(Stream<String> stream) {
        stream.forEach(s-> System.out.println(LocalTime.now() + " - value: " + s +
                " - thread: " + Thread.currentThread().getName()));

    }
}
/*
This clearly shows that in sequential stream, each iteration waits for currently running one to finish,
whereas, in parallel stream, eight threads are spawn simultaneously, remaining two, wait for others.
Also notice the name of threads. In parallel stream, Fork and Join framework is used in the background to create multiple threads.
Parallel streams create ForkJoinPool instance via static ForkJoinPool.commonPool() method.

 */