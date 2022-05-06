package AugustBatchProblem.Advanced.LinkedList;

import java.util.LinkedList;
/*
Problem Description

Given a sorted linked list, delete all duplicates such that each element appear only once.


Problem Constraints

0 <= length of linked list <= 106


Input Format

First argument is the head pointer of the linked list.


Output Format

Return the head pointer of the linked list after removing all duplicates.


Example Input

Input 1:

 1->1->2

Input 2:

 1->1->2->3->3



Example Output

Output 1:

 1->2

Output 2:

 1->2->3



Example Explanation

Explanation 1:

 Each element appear only once in 1->2.
 */
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}


public class RemoveDuplicateFromSortedList {

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);
        //deleteDuplicates(llist);


    }
    public static ListNode deleteDuplicates(ListNode A) {
        ListNode x = A;
        while(x.next!=null){
            ListNode xNext =x.next;
            if(x.val == xNext.val){
                x.next = xNext.next;
            }else{
                x = xNext;
            }
        }
        return A;
    }
}

