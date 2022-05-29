package AugustBatchProblem.LLD;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class WaitingWorker  implements  Runnable{
    private List<String> outputScraper;
    private CountDownLatch readyThreadCounter;
    private CountDownLatch callingThreadBlocker;
    private CountDownLatch completedThreadCounter;



    public WaitingWorker(List<String> outputScraper, CountDownLatch readyThreadCounter, CountDownLatch callingThreadBlocker, CountDownLatch completedThreadCounter) {
        this.outputScraper = outputScraper;
        this.readyThreadCounter = readyThreadCounter;
        this.callingThreadBlocker = callingThreadBlocker;
        this.completedThreadCounter = completedThreadCounter;
    }

    @Override
    public void run() {
        readyThreadCounter.countDown();
        try {
            callingThreadBlocker.await();
            doSomeWork();
            outputScraper.add("Counting Down");
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            completedThreadCounter.countDown();
        }

    }

    private void doSomeWork() {
        System.out.println("doing..");
    }
}
