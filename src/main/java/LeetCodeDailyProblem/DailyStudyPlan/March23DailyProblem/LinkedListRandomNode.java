package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LinkedListRandomNode {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(11);



    }

    List<ListNode> ans = new ArrayList<>();
    public void solution(ListNode head) {
        while(head!=null){
            ans.add(head);
            head = head.next;
        }
    }

    public int getRandom() {
        return ans.get((new Random()).nextInt(ans.size())).val;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
