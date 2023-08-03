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
    
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        
        // slow fast to find mid
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse from mid
        ListNode afterMid = slow.next;
        ListNode prev = slow.next = null;
        while (afterMid != null) {
            ListNode tmp = afterMid.next;
            afterMid.next = prev;
            prev = afterMid;
            afterMid = tmp;
        }
        
        // Re-assign 
        ListNode first = head;
        afterMid = prev;
        while (afterMid != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = afterMid.next;
            first.next = afterMid;
            afterMid.next = tmp1;
            first = tmp1;
            afterMid = tmp2;
        }
    }
}