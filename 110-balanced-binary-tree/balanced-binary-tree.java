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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return Math.abs(calculateHeight(root.right) - calculateHeight(root.left)) < 2 && isBalanced(root.left) && isBalanced(root.right);
        
    }

    public int calculateHeight(TreeNode node){
        if(node == null){
            return -1;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);
        
        return Math.max(leftHeight,rightHeight) + 1;
    }
}