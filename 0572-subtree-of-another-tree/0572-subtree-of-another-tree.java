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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if( subRoot == null) return true ;
        return fn( root,subRoot) ;
   }
    public boolean fn( TreeNode root , TreeNode subroot){
        if( root == null) return false ;
        if( isIdentical(root,subroot)) return true ;
        return fn( root.left, subroot) || fn( root.right,subroot) ;
    }

   public boolean isIdentical( TreeNode root , TreeNode subroot){
    if( root == null && subroot == null ) return true ;
    if( root == null || subroot == null) return false ;

    if( root.val == subroot.val){
        return isIdentical(root.left , subroot.left) && isIdentical( root.right , subroot.right) ;
    }
    return false ;
   }
}