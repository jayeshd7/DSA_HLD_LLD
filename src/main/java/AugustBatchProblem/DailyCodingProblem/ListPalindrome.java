package AugustBatchProblem.DailyCodingProblem;

import java.util.Stack;



class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
class ListPalindrome
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head)
    {
        Node slow = head;
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack<Integer>();

        while (slow != null){
            stack.push(slow.data);
            slow = slow.next;

        }
        while (head != null){
            int i = stack.pop();
            if(head.data == i){
                isPalindrome = true;
            }
            else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        return isPalindrome ;
    }
}
