package AugustBatchProblem.Advanced.stack;

import java.util.Stack;
/*
Problem Description

Given a stack of integers A, sort it using another stack.

Return the array of integers after sorting the stack using another stack.



Problem Constraints

1 <= |A| <= 5000

0 <= A[i] <= 1000000000



Input Format

The only argument given is the integer array A.


Output Format

Return the array of integers after sorting the stack using another stack.


Example Input

Input 1:

 A = [5, 4, 3, 2, 1]

Input 2:

 A = [5, 17, 100, 11]



Example Output

Output 1:

 [1, 2, 3, 4, 5]

Output 2:

 [5, 11, 17, 100]



Example Explanation

Explanation 1:

 Just sort the given numbers.

Explanation 2:

 Just sort the given numbers.

 */
public class Sortstackusinganotherstack {

    public static void main(String[] args) {
        int [] A = {66, 96, 43, 28, 14};
        int [] b = solveSortStack(A);
        for(int j =0; j<b.length;j++){
            System.out.println(b[j]);
        }
    }

    private static int [] solveSortStack(int [] A) {

        Stack<Integer> input = new Stack<Integer>();
        for (int i =0; i<A.length;i++){
            input.push(A[i]);
        }

        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            // pop out the first element
            int tmp = input.pop();
            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                input.push(tmpStack.pop());
            }

            tmpStack.push(tmp);

        }


       int [] ans = new int[tmpStack.size()];
        for (int i =0; i<tmpStack.size();i++){
            ans[i]= tmpStack.get(i);
        }
        return ans;
    }
}
