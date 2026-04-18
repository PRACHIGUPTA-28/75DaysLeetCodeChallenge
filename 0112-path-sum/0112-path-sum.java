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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fn( root , targetSum, 0) ;
    }
    public boolean fn(TreeNode root, int t, int sum){
        if( root == null) return false ;
        if( root.left == null && root.right == null){
            if( sum + root.val == t) return true ;
            else return false ;
        }
        if( root.left == null || root.right == null){
            return ( root.left == null) ? fn( root.right ,t , sum+root.val) : fn( root.left , t,sum+root.val) ;
        }
        return fn( root.left , t ,sum+root.val) || fn( root.right , t ,sum+root.val) ;
    } 
}