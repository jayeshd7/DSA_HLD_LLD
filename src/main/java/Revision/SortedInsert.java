
package Revision;

import java.util.LinkedList;


public class SortedInsert {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

    }
}
/*
    public  void sortedInsertSolve(int value){
        Node newNode = new Node(value, null);
        Node curr = head;

        if(curr == null || curr.value >value){
            newNode.next = head;
            head = newNode;
            return;
        }
        while (curr.next != null && curr.next.value <value){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

    }


}
*/
