package AugustBatchProblem.Advanced.LinkedList;



public class MiddleElementOfLinkedList {
 // 1->2->3->4->5

    //mid  -> 3
    static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
    public static void main(String[] args) {
       ListNode head = null;

        for(int i = 1; i<=5;i++){
            head = add(head, new ListNode(i));
        }
        getListNode(head);
        solve(head);
    }


    private static ListNode getListNode(ListNode head) {
        while(head != null){
            System.out.println(head.val);
             head = head.next;
        }
        return head;
    }

    public static ListNode add(ListNode head, ListNode value){
        if(head == null ){ head = value; return head;}
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = value;

        return head;
    }

    public static int solve (ListNode A){
            ListNode fast = A;
            ListNode slow = A;

            while (fast.next != null) {
                slow = slow.next;
                fast = (fast.next.next == null) ? fast.next : fast.next.next;
            }
        System.out.println("middle:"+ slow.val);
            return slow.val;
        }
    }







