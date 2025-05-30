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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        List<Integer>lst=new ArrayList<>();
        while(head!=null){
            lst.add(head.val);
            head=head.next;
        }
        k=k%lst.size();
        List<Integer>lst2=new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            lst2.add(null);  // Initialize with nulls or a default value
        }

        
        
        for(int i=0;i<lst.size();i++){
            lst2.set((k+i)%lst.size(),lst.get(i));
        }
        ListNode Dummy=new ListNode();
        ListNode temp=Dummy;
        for(int i=0;i<lst2.size();i++){
            temp.next=new ListNode(lst2.get(i));
            
            temp=temp.next;
        }
        
        return Dummy.next;
    }
}