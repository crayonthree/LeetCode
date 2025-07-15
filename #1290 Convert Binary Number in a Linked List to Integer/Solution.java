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
    public int getDecimalValue(ListNode head) {

        String binaryNumber = "";

        while(head!=null){
            binaryNumber = binaryNumber + head.val;
            head = head.next;
        }

        int pow = 0;
        int value = 0;
        for(int i=binaryNumber.length()-1;i>=0;i--){

            char currentChar = binaryNumber.charAt(i);

            if(currentChar == '1'){
                value = value + (int)Math.pow(2,pow);
            }

            pow++;            

        }

        return value;
    }
}