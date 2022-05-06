package AugustBatchProblem.RandomProblems;

public class insertUnsortedArray {


    public static void main(String[] args) {
        int arr[]
                = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };


        int n = arr.length;
        int x=6 ; int pos = 2;
        /*System.out.println("Initial Array:\n"
                + Arrays.toString(arr));
        //arr = insertArray(arr,n,x,pos);
        System.out.println("\nArray with " + x
                + " inserted at position "
                + pos + ":\n"
                + Arrays.toString(arr))
        ;*/

        int arr1[] = {1, 2, 3, 4, 5};
        int index = 2; int element = 90;
        int y = 2;
        int sizeofArray = arr1.length;
        insertUnsortedArray insertUnsortedArray = new insertUnsortedArray();

        //insertUnsortedArray.insertAtIndex(arr1,sizeofArray,index,element);
        insertUnsortedArray.deleteArray(arr1,sizeofArray,y);
        System.out.println("Modified array is");
        for (int i = 0; i < sizeofArray; i++)
            System.out.print(arr1[i]+" ");


    }

    private static int[] insertArray(int[] arr, int n, int x, int pos) {


        int [] newArr = new int[n+1];
        for (int i = 0 ; i< n+1;i++){
            if (i < pos -1){
                newArr[i] = arr[i];

            }
            else if(i == pos-1){
                newArr[i] = x;
            }
            else {
                newArr[i] = arr[i-1];
            }
        }



        return newArr;
    }


    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        // if index is last index
        // then insert the element
        if(index==sizeOfArray-1)
        {
            arr[index]=element;
            return;
        }

        arr[sizeOfArray-1] = -1;
        // else shift the elements, and then insert
        for(int i=sizeOfArray-1;i>index;i--)
        {
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        arr[index]=element;

        for(int i =0; i<sizeOfArray;i++){
            System.out.print(arr[i] + " ");
        }

    }

    public int deleteArray(int arr[], int n, int x){


            int i;
            for (i=0; i<n; i++)
                if (arr[i] == x)
                    break;

            // If x found in array
            if (i < n)
            {
                // reduce size of array and move all
                // elements on space ahead
                n = n - 1;
                for (int j=i; j<n; j++)
                    arr[j] = arr[j+1];
            }

            return n;
        }

    }




