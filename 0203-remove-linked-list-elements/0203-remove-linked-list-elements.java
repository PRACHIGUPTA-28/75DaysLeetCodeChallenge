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
        return fn( head,val) ;
    }
    public ListNode fn(ListNode head, int val){
        if( head == null) return null ;
        if( head.next == null) return head.val == val ? null : head ;
        ListNode prev = null ;
        ListNode curr = head ;
        while( curr != null){
            ListNode next = curr.next; 
            if( curr.val == val){
                if( curr == head){
                    head = head.next ;
                    curr = head ;
                }
                else{
                    prev.next = next ;
                    curr = next ;
                }
            }
            else{
                prev = curr ;
                curr = next ;
            }
        }
        return head ;
    }
}