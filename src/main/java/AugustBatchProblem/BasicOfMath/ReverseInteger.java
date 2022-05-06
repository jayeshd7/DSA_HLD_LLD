package AugustBatchProblem.BasicOfMath;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(solve(-123));
    }

    private static int solve(int num) {



            // Handling negative numbers
            boolean negativeFlag = false;
            if (num < 0)
            {
                negativeFlag = true;
                num = -num ;
            }

            int prev_rev_num = 0, rev_num = 0;
            while (num != 0)
            {
                int curr_digit = num%10;

                rev_num = (rev_num*10) + curr_digit;

                // checking if the reverse overflowed or not.
                // The values of (rev_num - curr_digit)/10 and
                // prev_rev_num must be same if there was no
                // problem.
                if ((rev_num - curr_digit)/10 != prev_rev_num)
                {
                    //System.out.println("WARNING OVERFLOWED!!!");
                    return 0;
                }

                prev_rev_num = rev_num;
                num = num/10;
            }

            return (negativeFlag == true)? -rev_num : rev_num;
    }
}
