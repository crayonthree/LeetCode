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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode();
        ListNode base = current;
        int rem = 0;
        while(l1 != null || l2 != null || rem > 0){
            int l1val = 0;
            int l2val = 0;
            if(l1 != null){
                l1val = l1.val;
            }
            if(l2 != null){
                l2val = l2.val;
            }

            int subTotal = l1val + l2val + rem;

            rem = subTotal / 10 ;
            ListNode newNode = new ListNode( subTotal - (rem*10) );
            current.next = newNode;

            if(l1 != null && l1.next != null){
                l1 = l1.next;
            }else{
                l1 = null;
            }
            if(l2 != null && l2.next != null){
                l2 = l2.next;
            }else{
                l2 = null;
            }
            current = current.next;
        }

        return base.next;
        
    }
}

/* Time Complexity: O(n) */
