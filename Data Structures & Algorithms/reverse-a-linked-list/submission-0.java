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
        if(head == null) return null;

        ListNode curr = head;
        ListNode prev = null;
        
        while(curr.next != null){
            //store the next node
            ListNode temp = curr.next;

            //set the next pointer to previous pointer
            curr.next = prev;

            //update previous to become current
            prev = curr;

            //now update current to be the previous next.
            curr = temp;
        }

        curr.next = prev;


        return curr;
    }
}
