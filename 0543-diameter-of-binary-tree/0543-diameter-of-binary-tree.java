/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return fn( root ) ;
    }
    public int fn( TreeNode root){
        if( root == null) return 0 ; 
        int d1 = fn( root.left) ;
        int d2 = fn( root.right) ;
        int d3 = ht(root.left) + ht( root.right)  ; 

        return Math.max( d3 , Math.max( d2,d1)) ;
    }
    public int ht( TreeNode root){
        if( root == null) return 0 ; 
        int left = ht(root.left) ;
        int right = ht( root.right) ;
        
        return Math.max(left,right) +1 ;
    }
}