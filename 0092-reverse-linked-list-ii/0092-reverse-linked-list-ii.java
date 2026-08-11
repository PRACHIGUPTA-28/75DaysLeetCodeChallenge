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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start = head ;
        ListNode startBef = null ;
        ListNode end = null ;
        //ListNode dummy = head ;
        left-- ;
        while(left-->0){
            startBef = start ;
            start = start.next ;
        }
        ListNode dummy = head ;
        while(right-->0){
            end = dummy ;
            dummy = dummy.next ;
        }
        ListNode endNext = end.next ;
        ListNode curr = start.next ;
        ListNode prev = start ;
        while(curr != endNext){
            ListNode next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        if(startBef != null)
        startBef.next = prev ;
        else head = prev ;
        start.next = endNext ;
        return head ;
        
    }
}