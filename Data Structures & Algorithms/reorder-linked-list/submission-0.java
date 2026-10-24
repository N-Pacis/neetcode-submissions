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
        
        //find second half
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //second half starts here, reverse it
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(second != null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
       

       //now merge two halves
        second = prev; //beginning of the reversed second half
        ListNode first = head;
        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            
            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

    }
}
