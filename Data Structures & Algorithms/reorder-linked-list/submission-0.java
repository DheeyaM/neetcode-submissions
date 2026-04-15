class Solution {
    public void reorderList(ListNode head) {

       ListNode fast = head;
       ListNode slow = head;
       while (fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
       }


       //reversing from slow to fast;

       ListNode prev = null;
       ListNode next = null;
       ListNode curr = slow.next;
       slow.next = null;

       while (curr != null){
      next = curr.next;   
curr.next = prev;  
prev = curr;       
curr = next;   
       }

       
       ListNode first = head;
       ListNode second = prev;

       while (second != null){
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;
        first.next = second;
        second.next = temp1;
        first = temp1;
        second = temp2;
       }

    }
}