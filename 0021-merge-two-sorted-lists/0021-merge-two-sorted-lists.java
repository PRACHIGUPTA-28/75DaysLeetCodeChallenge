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
        ArrayList<Integer> arr = new ArrayList<>() ;
        ListNode temp = list1 ;
        while( temp != null){
            arr.add( temp.val) ;
            temp = temp.next ; 
        }  temp = list2 ;
        while( temp != null){
            arr.add( temp.val) ;
            temp = temp.next ; 
        }
        Collections.sort(arr) ;
        ListNode head = new ListNode(0) ;
        ListNode curr = head ; 
        for( int a : arr){
            curr.next = new ListNode(a) ;
            curr = curr.next ;
        }

        return head.next ; 

    }
}