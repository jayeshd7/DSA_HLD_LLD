package AugustBatchProblem.DailyCodingProblem;

public class CatalanDPProblem {

    // Catalan number
    static int catalanDP(int n)
    {

        int catalan[] = new int[n + 2];


        catalan[0] = 1;
        catalan[1] = 1;

        // Fill entries in catalan[]
        // using recursive formula
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i]
                        += catalan[j] * catalan[i - j - 1];
            }
        }

        // Return last entry
        return catalan[n];
    }

    // Driver code
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++) {
            System.out.print(catalanDP(i) + " ");
        }
    }
}
