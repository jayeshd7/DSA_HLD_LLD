package AugustBatchProblem.Advanced.Searching;

import java.util.ArrayList;
import java.util.Collections;

/*
Problem Description

Farmer John has built a new long barn, with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall, and an integer B which represent the number of cows.

His cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?



Problem Constraints

2 <= N <= 100000
0 <= A[i] <= 109
2 <= B <= N


Input Format

The first argument given is the integer array A.
The second argument given is the integer B.


Output Format

Return the largest minimum distance possible among the cows.


Example Input

Input 1:

A = [1, 2, 3, 4, 5]
B = 3

Input 2:

A = [1, 2]
B = 2



Example Output

Output 1:

 2

Output 2:

 1

 */
public class Aggressivecows {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(5);A.add(17);A.add(100);A.add(11);
        int B = 2;
        System.out.println(solveAggresiveCow(A, B));
    }

    private static int solveAggresiveCow(ArrayList<Integer>A, int B) {
        Collections.sort(A);
        int n = A.size();
        int low = A.get(0);
        int high = A.get(n-1)- A.get(0);
        int ans = 0;

        while(low<=high){

            int mid = low + (high -low)/2;
            if(check(A,mid,B)){
                    low = mid+1;
                    ans = mid;

            }
            else{
                high = mid -1;
            }

        }
        return ans;
    }

    private static boolean check(ArrayList<Integer> A, int mid, int B) {
        int cows=1;               // we already place it at the first available slot i.e stalls[0]  ( GREEDY )
        int lastCowPosition=A.get(0);
        for(int i=1;i<A.size();i++)
        {
            if(A.get(i)-lastCowPosition>=mid)
            {
                cows++;
                lastCowPosition=A.get(i);
                if(cows>=B) return true;
            }
        }
        return false;
    }
}
