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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>() ;
        fn( root, list ) ;

        return list ;
    }
    public void fn( TreeNode root , List<List<Integer>> list) {
        if( root == null) return  ;
        Queue<TreeNode> q = new LinkedList<>() ; 
        q.add(root) ;
        q.add(null) ;
        
        List<Integer> ans = new ArrayList<>() ; 

        while( !q.isEmpty()){
            TreeNode curr = q.remove() ; 
                if( curr == null){
                    if( q.isEmpty()){
                        list.add(ans) ; 
                        break ; 
                    }
                    else{
                     list.add(ans) ; 
                     ans = new ArrayList<>() ;
                        q.add(null) ; 
                    }
                }
                else{
                    ans.add(curr.val) ;

                    if( curr.left != null) q.add(curr.left) ;
                    if( curr.right != null) q.add(curr.right)  ;
                } 
        }
    }
}