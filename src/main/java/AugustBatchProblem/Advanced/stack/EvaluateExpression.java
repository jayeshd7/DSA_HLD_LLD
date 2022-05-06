package AugustBatchProblem.Advanced.stack;

import java.util.Stack;

public class EvaluateExpression {

    public static void main(String[] args) {
        String [] A = {"2", "2", "/"};
        System.out.println(solveEvaluateExpression(A));
    }

    private static int solveEvaluateExpression(String [] A) {
        Stack<Integer> s1=new Stack<Integer>();

        for(int i=0;i<A.length;i++)
        {

            String c=A[i];
            if(c.equals("*"))
            {
                int a=s1.pop();
                int b=s1.pop();
                s1.push(a*b);
            }
            else if(c.equals("+"))
            {
                int a=s1.pop();
                int b=s1.pop();
                s1.push(a+b);
            }
            else if(c.equals("/"))
            {
                int a=s1.pop();
                int b=s1.pop();
                s1.push(b/a);
            }
            else if(c.equals("-"))
            {
                int a=s1.pop();
                int b=s1.pop();
                s1.push(b-a);
            }
            else
            {
                s1.push(Integer.parseInt(c));
            }


        }
        return s1.peek();
    }
}
