package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class OddEvenProblem {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(2);
        al.add(5);
        al.add(6);

        solve(al);

    }
    public static int solve(ArrayList<Integer> A) {

            int ans1 = 0;
            int ans2 = 0;
            Boolean odd = true;

            for(int i =0; i<A.size();i++){
                if(odd == true){
                    if(A.get(i) %2 == 1){
                        ans1++;
                        odd = false;
                    }
                }
                else {
                    if(A.get(i) % 2 == 0){
                        ans1++;
                        odd = true;
                    }
                }
            }
            odd = false;
        for(int i =0; i<A.size();i++){
            if(odd == true){
                if(A.get(i) %2 == 1){
                    ans2++;
                    odd = false;
                }
            }
            else {
                if(A.get(i) % 2 == 0){
                    ans2++;
                    odd = true;
                }
            }
        }
        System.out.println(Math.max(ans1, ans2));
        return Math.max(ans1, ans2);

    }

       /* ArrayList<Integer> al1 = new ArrayList<>();


        for(int i = 0; i<A.size()-1;i++){
            if(A.get(i) % 2 ==1){
                al1.add(A.get(i));
            }
            else if(A.get(i) % 2 == 0){
                al1.add(A.get(i));
            }
        }
        System.out.println(al1);
        return al1.size();*/



       /* int n= A.size();
        ArrayList<Integer> lis = new ArrayList<>();
        ArrayList<Integer> lds = new ArrayList<>();
        for(int i=0;i<n;i++){
            lis.add(i,1);
            lds.add(i,1);
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(A.get(i)>A.get(j)&&lis.get(i)<lis.get(j)+1)
                    lis.set(i, lis.get(j)+1);

            }
        }
        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(A.get(i)>A.get(j)&&lds.get(i)<lds.get(j)+1)
                    lds.set(i, lds.get(j)+1);;
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
            ans=Math.max(ans,lis.get(i)+lds.get(i)-1);

        System.out.println(ans);
        return ans;*/

}
