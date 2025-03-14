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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       //base case
       if(p == null && q == null){
        return true;
       }
       else if (q != null && p != null && p.val == q.val){
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
       }else{
        return false;
       }
    }
}

