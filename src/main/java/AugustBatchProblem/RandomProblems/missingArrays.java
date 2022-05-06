package AugustBatchProblem.RandomProblems;// package whatever; // don't place package name!
//Write a program to find out missing numbers in the given sequential
//set. Ex: {2,5,8,10,15}. It should print {3,4,6,7,9,11,12,13,14}.

class missingArrays {


    public static void main(String[] args) {

        int ans = testfunction(6);
        System.out.println(ans);

    }

     static int testfunction(int n) {

       if(n ==0 || n==1 || n==2){ return 0;}
       if (n==3) return 1;
       else return printTr(n-1)+ printTr(n-2)+ printTr(n-3);

       }

     static int printTr(int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(i);
        }
        return i;
    }
}

