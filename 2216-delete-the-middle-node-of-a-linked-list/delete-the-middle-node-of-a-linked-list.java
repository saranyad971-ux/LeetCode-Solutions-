/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     
 */

        class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // If only one node, delete it
        if (head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        
        // Find middle using slow-fast pointer
        while (fast!= null && fast.next!= null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Skip the middle node
        prev.next = slow.next;
        
        return head;
    }
}