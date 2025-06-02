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
    public ListNode removeElements(ListNode head, int val) {
        // if(head==null || (head.next==null && head.val!=val) ) return head;
        // ListNode dummy=new ListNode();
        // ListNode temp=dummy;
        // // ListNode temp=head;
        // while(head!=null ){
        //     if(head.val==val){
        //         // head=head.next.next;
        //         head=head.next;
        //         continue;
        //     }
        //     temp.next=new ListNode(head.val);

        //     temp=temp.next;
        //     head=head.next;
        // }
        // return dummy.next;

        if(head == null) return null;
        head.next=removeElements(head.next,val);
        return head.val==val?head.next:head;
        
    }
}