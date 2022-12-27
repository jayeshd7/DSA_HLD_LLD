package LeetCode.DailyStudyPlan;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next =    new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode ans = mergeTwoLists(l1,l2);
       for(ListNode temp = ans; temp!=null; temp = temp.next){
           System.out.println(temp.val);
       }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1!=null){
            temp.next = l1;
        }
        if(l2!=null){
            temp.next = l2;
        }
        return dummy.next;
    }

    public static class ListNode {
     int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


}
