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
    public void reorderList(ListNode head) {
        if( head.next == null || head.next.next == null ) return ; 
        Stack<ListNode> st =  new Stack<>() ;
        fn( head , st) ;
        ListNode temp = head ;
        while(!st.isEmpty()){
            ListNode next = temp.next ;
            ListNode put = st.pop() ; 
            temp.next = put ;
            put.next = next ;
            temp = temp.next.next ;
        }

    }
    public ListNode fn( ListNode head , Stack<ListNode> st){
        ListNode temp = head ;
        int count = 0 ;
        while( temp != null){
            count++ ;
            temp = temp.next ;
        }
        temp = head ;
        ListNode middle = null ; 
        int k = 1 ;
        if(count%2==0){
            while(k <= count/2){
                middle = temp ;
                temp = temp.next ; 
                k++ ; 
            }
        }
        else{
            while(k <= count/2 + 1){
                middle = temp ; 
                temp = temp.next ; 
                k++ ;
            }
        }
 
        while(temp != null){
            st.push(temp) ;
            temp = temp.next ;
        }
            middle.next = null ;
            return head ;
    }
}