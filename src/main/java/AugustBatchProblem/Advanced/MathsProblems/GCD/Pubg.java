package AugustBatchProblem.Advanced.MathsProblems.GCD;

/*
Problem Description

There are N players each with strength A[i]. when player i attack player j, player j strength reduces to max(0, A[j]-A[i]). When a player's strength reaches zero, it loses the game and the game continues in the same manner among other players until only 1 survivor remains.

Can you tell the minimum health last surviving person can have?
 */
public class Pubg {

    public static void main(String[] args) {
        int [] A = {2,3,4};
        System.out.println(pubgSolve(A));
    }

    private static int pubgSolve(int [] A) {

        int result = 0;
        for (int ele: A){
            result = gcd(result, ele);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
        }

    private static int gcd(int a, int b) {
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
