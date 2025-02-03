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
        ListNode curr=head;
        ListNode after=null;
        ListNode prev=null;


        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }

        return prev;
    }
}