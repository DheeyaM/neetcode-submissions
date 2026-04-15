/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode next = null;
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        ListNode curr = prev;
        int nth = 1;
        if (n == 1){
            prev = prev.next;
        } else {
        while (curr != null && nth < n - 1){
            curr = curr.next;
            nth++;
        }
        
        if (curr != null && curr.next != null){
        curr.next = curr.next.next;
        } 
        }
        

         ListNode next2 = null;
        ListNode prev2 = null;
        ListNode cur2 = prev;

        while (cur2 != null){
            next2 = cur2.next;
            cur2.next = prev2;
            prev2 = cur2;
            cur2 = next2;
        }

        return prev2;
    }
}
