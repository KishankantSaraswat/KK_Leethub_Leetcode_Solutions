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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp=dummy;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next=new ListNode(t1.val);
                t1=t1.next;
                // temp=temp.next;
            }
            else if(t1.val>t2.val){
                temp.next=new ListNode(t2.val);
                t2=t2.next;
                // temp=temp.next;
            }else{
                temp.next=new ListNode(t1.val);
                temp=temp.next;
                temp.next=new ListNode(t2.val);
                t1=t1.next;
                t2=t2.next;
            }
            temp=temp.next;

        }

        while(t1!=null){
            temp.next=new ListNode(t1.val);
            temp=temp.next;
            t1=t1.next;
        }
        while(t2!=null){
            temp.next=new ListNode(t2.val);
            temp=temp.next;
            t2=t2.next;
        }
        return dummy.next;



    }
}