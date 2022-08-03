package AugustBatchProblem.Day1;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch=='(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            }
            else{
                if(!stack.empty()){

                    char topChar = stack.peek();

                    if((ch=='}' && topChar=='{')||
                            (ch==')' && topChar=='(')||
                            (ch==']' && topChar=='[')){

                        stack.pop();

                    }else{
                        System.out.println("not valid");
                    }
                }
                else{
                    System.out.println("not valid");
                }
            }
        }
        if(stack.empty())
            System.out.println(" valid");
        else
            System.out.println(" valid");
    }

    }

