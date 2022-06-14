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
        Stack<Integer> s2 = new Stack<>();
        while(s1.isEmpty() == false){
         temp = s1.pop();
         while(s2.isEmpty() == false && s2.peek() < temp){
             s1.push(s2.pop());
         }
         s2.push(temp);
        }
        while (s2.isEmpty() == false){
            s1.push(s2.pop());
        }

    }
}
