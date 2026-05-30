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
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;      // Tracks the previous node 
        ListNode curr = head;      // Tracks the current node

        // go through the list until we reach the end
        while (curr != null) {
            ListNode temp = curr.next; // Save the next node before breaking the link
            curr.next = prev;          // Reverse the pointer 
            prev = curr;               // Move 'prev' forward 
            curr = temp;               // Move 'curr' forward 
        }

        // At the end, 'prev' points to the new head of the reversed list
        return prev;
    }
}
