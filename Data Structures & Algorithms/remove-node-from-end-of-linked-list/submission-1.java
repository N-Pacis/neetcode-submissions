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
        ListNode first = head;
        ListNode second = new ListNode(-1, head);
        int count = 0;

        while(first != null){
            first = first.next;
            count++;
            if(count > n){
                second = second.next;
            }
        }
        
        second.next = second.next.next;
        if(count == n) return second.next;

        return head;
    }
}
