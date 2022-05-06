package AugustBatchProblem.Advanced.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*
Reversing Elements Of Queue


Problem Description

Given an array of integers A and an integer B. We need to reverse the order of the first B elements of the array, leaving the other elements in the same relative order.

NOTE: You are required to first insert elements into an auxiliary queue then perform Reversal of first B elements.



Problem Constraints

1 <= B <= length of the array <= 500000
1 <= A[i] <= 100000


Input Format

The argument given is the integer array A and an integer B.


Output Format

Return an array of integer after reversing the first B elements of A using queue.


Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
 B = 3

Input 2:

 A = [5, 17, 100, 11]
 B = 2



Example Output

Output 1:

 [3, 2, 1, 4, 5]

Output 2:

 [17, 5, 100, 11]
 */
public class ReversingElementsOfQueue {

    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        int k = 3;
        solutionReversingElementsOfQueue(A, k);
    }

    private static int[] solutionReversingElementsOfQueue(int [] A, int k) {
        int [] ans = new int [A.length];
        Queue<Integer> queue
                = new LinkedList<>();
        for(int i =0; i<A.length;i++){
            queue.add(A[i]);
        }
        if (queue.isEmpty() == true
                || k > queue.size())
            return new int [-1];
        if (k <= 0)
            return new int [-1];

        Stack<Integer> stack = new Stack<Integer>();

        // Push the first K elements into a Stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }

        // Enqueue the contents of stack
        // at the back of the queue
        while (!stack.empty()) {
            queue.add(stack.peek());
            stack.pop();
        }

        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }

       Object [] a = queue.toArray();
        for(int i = 0;i<a.length;i++){
            ans[i]= (int) a[i];
        }
        return ans;

    }
}
