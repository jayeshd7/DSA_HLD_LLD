package Revision;

import java.util.Stack;

public class SortStack2 {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(3);
        s1.push(1);
        s1.push(4);
        s1.push(2);
        System.out.println(s1);
        sortedStack2(s1);
        System.out.println(s1);


    }

    private static void sortedStack2(Stack<Integer> s1) {
        int temp;
        var s2 = new Stack<Integer>();
        while(!s1.isEmpty()){
         temp = s1.pop();
         while(!s2.isEmpty() && s2.peek() < temp){
             s1.push(s2.pop());
         }
         s2.push(temp);
        }
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }
}
