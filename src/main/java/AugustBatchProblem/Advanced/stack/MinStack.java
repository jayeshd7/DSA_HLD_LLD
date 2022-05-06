package AugustBatchProblem.Advanced.stack;

import java.util.Stack;
/*
Problem Description

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

NOTE:

    All the operations have to be constant time operations.
    getMin() should return -1 if the stack is empty.
    pop() should return nothing if the stack is empty.
    top() should return -1 if the stack is empty.



Problem Constraints

1 <= Number of Function calls <= 107


Input Format

Functions will be called by the checker code automatically.


Output Format

Each function should return the values as defined by the problem statement.


Example Input

Input 1:

push(1)
push(2)
push(-2)
getMin()
pop()
getMin()
top()

Input 2:

getMin()
pop()
top()



Example Output

Output 1:

 -2 1 2

Output 2:

 -1 -1

 */
public class MinStack {
    private static Stack<Integer> stack = new Stack<Integer>();
    private static Stack<Integer> MinStack = new Stack<Integer>();

    public static void main(String[] args) {
    }

        public void push ( int x){

            if (stack.isEmpty() || MinStack.peek() > x)
                MinStack.push(x);
            else
                MinStack.push(MinStack.peek());

            stack.push(x);
        }

        public void pop () {

            if (stack.isEmpty())
                return;
            stack.pop();
            MinStack.pop();
        }

        public int top () {

            if (stack.isEmpty())
                return -1;
            return stack.peek();
        }

        public int getMin () {

            if (stack.isEmpty())
                return -1;
            return MinStack.peek();
        }
    }

