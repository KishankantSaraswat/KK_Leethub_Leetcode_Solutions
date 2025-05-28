/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;

        int countA=0;
        int countB=0;

        while(tempA!=null){
            countA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            countB++;
            tempB=tempB.next;
        }

        tempA=headA;
        tempB=headB;
        while(countA>countB){
            tempA=tempA.next;
            countA--;
        }
        while(countA<countB){
            tempB=tempB.next;
            countB--;
        }

        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }

        return tempA;

        

    }
}