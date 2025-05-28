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
    public boolean isPalindrome(ListNode head) {
        ListNode tempA=head;
        Stack<Integer>st=new Stack<>();

        while(tempA!=null){
            
            st.push(tempA.val);
            tempA=tempA.next; 
        }
        tempA=head;
        while(tempA!=null){
            if(tempA.val!=st.pop()){
                return false;
            }
            tempA=tempA.next;
        }
        return true;
        
    }
}