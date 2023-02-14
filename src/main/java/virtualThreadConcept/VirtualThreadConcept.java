package virtualThreadConcept;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class VirtualThreadConcept {
    public static void main(String[] args) {
        ExecutorService executor = Executor.newVirtualThreadExecutor();

        executor.submit(() -> {
            System.out.println("Hello from " + Thread.currentThread().getName());
        });

        Callable<String> task = () -> {
            System.out.println("Hello from " + Thread.currentThread().getName());
            return "Hello from " + Thread.currentThread().getName();
        };
        Future<String> submit = executor.submit(task);
        try {
            System.out.println(submit.get());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
