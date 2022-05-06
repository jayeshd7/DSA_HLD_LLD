package AugustBatchProblem.MultiDimensionArray;

import java.util.ArrayList;

public class SearchInRowWiseAndColoumnWise {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arraylist2D = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1=new ArrayList();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

// Create second list
        ArrayList<Integer> list2=new ArrayList();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

// Create third list
       /* ArrayList<Integer> list3=new ArrayList();
        list3.add(7);
        list3.add(8);
        list3.add(9);*/


// Add individual list to arraylist2D
        arraylist2D.add(list1);
        arraylist2D.add(list2);
        //arraylist2D.add(list3);




        //solve(arraylist2D,10 );
        optimizeWay(arraylist2D, 10);
    }

    private static int optimizeWay(ArrayList<ArrayList<Integer>> A, int B) {
        int i = 0;
        int j = A.get(0).size()-1;
        int position = 0;
        int row = A.size();
        if(row == 0){
            return -1;
        }



        while(j>=0 && i < A.size()-1){
            if(A.get(i).get(j) == B){
                position = (i +1) * 1009 +(j+1);
                System.out.println(position);
                return position;
            }
            else if(A.get(i).get(j) > B){
                j--;
            }
            else if(A.get(i).get(j) < B){
                i++;
            }

        }
        System.out.println(position);
        return -1;

    }

    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int position = 0;

        int row = A.size();
        int col = A.get(0).size();
        if (row == 0)
            return -1;
        int value =0;
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                value = A.get(i).get(j);
                if(value == B){
                    position = ((i +1) * 1009 +j);
                    return position;
                }

            }
        }
        if(value != B){
            position = -1;
            return position;
        }
        System.out.println(position);
        return position;
    }
}
/*if(a == null || a.size() == 0 || a.get(0).size() == 0) {
            return 0;
	    }
        int m = a.size();
        int n = a.get(0).size();
        int start = 0;
        int mid, x, y;
        int end = m * n - 1;
        while(start <= end) {
            mid = (start + end)/2;
            x = mid/n;
            y = mid % n;
            if(a.get(x).get(y) == b) {
                return 1;
            } else if(a.get(x).get(y) < b) {
                start=mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
	}
*
* */