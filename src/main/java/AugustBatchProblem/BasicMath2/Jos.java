package AugustBatchProblem.BasicMath2;

public class Jos {



    static int myJos(int n)
    {

        if(n >0) return (int) ((2 * n) - Math.pow(2,(1+Math.floor(Math.log(n)/Math.log(2))))+ 1);

        else return -1;

    }


    public static void main(String args[])
    {
        System.out.println(myJos(-1));
    }
}
