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
        if(headA == headB) return headA ;
        ListNode temp = headA ;
        while(temp != null){
            ListNode ans = fn(temp, headB) ;
            if(ans != null) return ans ;
            temp = temp.next ;
        }
        return null ;
    }
    public ListNode fn(ListNode temp, ListNode headB){
        if(headB == null) return null ;
        if(temp == headB) return temp ;
        return fn(temp, headB.next) ;
    }
}