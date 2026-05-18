/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       return fn(root, p, q) ;
    }
    public TreeNode fn(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null ;
        if(root == p || root == q) return root ;
        TreeNode right = fn(root.right, p, q) ;
        TreeNode left = fn(root.left, p , q) ;
        if( right != null && left != null) return root ;
        return left==null ? right : left ;
    }
}
