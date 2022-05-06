package AugustBatchProblem.ProblemSolving;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class TwitterMock {

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 6, 7, 8};
        System.out.println(maxSlidingWindow(nums, 3));
        System.out.println(maxSlidingWindow1(nums, 3));

    }

    public static int maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int start = 0;


        for (int i = 0; i < nums.length; i++) {

            if (!deque.isEmpty() && deque.peek() < start)
                deque.poll();


            while (!deque.isEmpty() && nums[i] <= nums[deque.peekLast()])
                deque.pollLast();

            deque.add(i);


            if (i >= k - 1)
                result[start++] = nums[deque.getFirst()];
        }

        int maxValue = result[0];
        for (int i = 1; i < result.length; i++) {
            if (result[i] > result[i - 1]) {
                maxValue = Math.max(result[i], maxValue);
            }
        }
        return maxValue;
    }

    public static int[] maxSlidingWindow1(int[] nums, int k) {

        int[] result = new int[nums.length - k + 1];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (list.size() > 0 && nums[list.peekLast()] > nums[i]) {
                list.pollLast();
            }
            list.addLast(i);
            int j = i - k + 1;
            if (list.peekFirst() < j) {
                list.pollFirst();
            }
            // Left pointer also points to our result array.
            if (j >= 0) {
                result[j] = nums[list.peekFirst()];
            }
        }
        for(int i : result){
            System.out.println(result[i]);
        }
        return result;
    }
}
