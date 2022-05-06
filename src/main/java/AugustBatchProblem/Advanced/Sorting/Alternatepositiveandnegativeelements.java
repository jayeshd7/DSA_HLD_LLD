package AugustBatchProblem.Advanced.Sorting;

public class Alternatepositiveandnegativeelements {

    public static void main(String[] args) {
        int [] A = {-1, -2, -3, 4, 5};
        int [] B = solveAlternatepositiveandnegativeelements(A);
        for(int i =0;i<B.length;i++){
            System.out.println(B[i]);
        }

    }
   public static int[] solveAlternatepositiveandnegativeelements(int [] A){
       int size = A.length;
       int posStartIndex = 0, i, j, temp;

       for (i = 0; i < size; i++)
       {
           if (A[i] < 0)
           {
               temp = A[i];
               for (j = i; j > posStartIndex; j--)
               {
                   A[j] = A[j-1];
               }
               A[posStartIndex] = temp;
               posStartIndex++;
           }
       }

       int pos = posStartIndex, neg = 1;

       while (pos < size && neg < pos && A[neg] < 0)
       {
           i = pos;
           temp = A[i];
           while(i > neg)
           {
               A[i] = A[i-1];
               i--;
           }
           A[neg] = temp;

           neg += 2;
           pos++;
       }
       return A;
    }
}
