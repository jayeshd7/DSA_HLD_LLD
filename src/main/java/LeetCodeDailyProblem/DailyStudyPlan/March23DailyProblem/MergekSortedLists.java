package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class MergekSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode[] lists = new ListNode[]{l1, l2, l3};
        ListNode ans = mergeKLists(lists);
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

    private static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(true){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int i = 0; i < lists.length; i++){
                if(lists[i] != null && lists[i].val < min){
                    min = lists[i].val;
                    index = i;
                }
            }
            if(index == -1) break;
            curr.next = lists[index];
            lists[index] = lists[index].next;
            curr = curr.next;
        }
        return head.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
