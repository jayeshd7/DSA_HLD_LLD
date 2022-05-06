package AugustBatchProblem.Advanced.Backtracking;

import java.util.ArrayList;

/*
Generate all Parentheses II
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.


Problem Constraints

1 <= A <= 20


Input Format

First and only argument is integer A.


Output Format

Return a sorted list of all possible paranthesis.


Example Input

Input 1:

A = 3

Input 2:

A = 1



Example Output

Output 1:

[ "((()))", "(()())", "(())()", "()(())", "()()()" ]

Output 2:

[ "()" ]

 */
public class GenerateParenthis {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    static ArrayList<String> answer = new ArrayList<String>();
    public static ArrayList<String> generateParenthesis(int a) {


        char[] arr= new char[2*a];
        recurse(arr,0,0,a);
        return answer;
    }



    public static void recurse(char[] arr,int open,int close,int n) {

        int pos = open + close;
        if(pos == 2*n) {
            String s = new String(arr);
            answer.add(s);
        }

        if(open < n) {
            arr[pos] = '(' ;
            recurse(arr,open+1,close,n);
        }
        if(close < open) {
            arr[pos] = ')';
            recurse(arr,open,close+1,n);
        }



    }
}

