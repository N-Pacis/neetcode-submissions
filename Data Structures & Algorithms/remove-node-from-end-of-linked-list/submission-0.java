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
        
        ListNode curr = head;
        int count = 0;

        while (curr != null){
            curr = curr.next;
            count++;
        }

        if(n > count) return head;
        if(n == count) return head.next;

        int target = count - n;

        curr = head;
        count = 0;
        while(curr != null){
            if(count == target - 1){
                if(curr.next == null) curr.next = null;
                else curr.next = curr.next.next;  
                break;
            }else{
                curr = curr.next;
                count++;
            }
        }

        return head;
    }
}
