package AugustBatchProblem.Advanced.Arrays;

public class FindMinLengthOfSubArray {

    public static void main(String[] args) {
        int arr [] = {3,2,1,6,8,4,2,1,3,4,7,8};

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        int pos_min = -1;
        int pos_max = -1;
        int pos_min_ans = pos_min;

        int ans = Integer.MAX_VALUE;

        for(int j =0; j<arr.length;j++){


            if(arr[j]== min){
                pos_min = j;
            }
            if(arr[j] == max){
                pos_max = j;
            }
            pos_min_ans = pos_min;
            if (pos_max != -1 && pos_min_ans != -1)
                ans = Math.min(ans,
                        Math.abs(pos_min - pos_max) + 1);
            pos_min_ans = Math.min(pos_min_ans,pos_min);
        }

        System.out.println("pos_min" + pos_min_ans);
        System.out.println("pos_max" + pos_max);
        /*for(int k = pos_min;k<pos_max+1;k++){
            System.out.println(arr[k]);
        }*/
        System.out.println(ans);
        }

    }

