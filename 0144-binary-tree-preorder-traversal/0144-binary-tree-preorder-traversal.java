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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>() ;
        fn(root,ls) ;
        return ls ;
    }
    public void fn(TreeNode root, List<Integer> ls){
        if(root == null) return ;
        ls.add(root.val) ;
        fn(root.left, ls) ;
        fn(root.right, ls) ;
    }
}