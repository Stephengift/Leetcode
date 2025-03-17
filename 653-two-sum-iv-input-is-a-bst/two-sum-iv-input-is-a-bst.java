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
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        TreeNode left = root, right = root;

        // Initialize the left stack (in-order, smallest to largest)
        while (left != null) {
            leftStack.push(left);
            left = left.left;
        }

        // Initialize the right stack (reverse in-order, largest to smallest)
        while (right != null) {
            rightStack.push(right);
            right = right.right;
        }

        while (!leftStack.isEmpty() && !rightStack.isEmpty() && leftStack.peek() != rightStack.peek()) {
            int leftVal = leftStack.peek().val;
            int rightVal = rightStack.peek().val;
            int sum = leftVal + rightVal;

            if (sum == k) return true;
            else if (sum < k) {
                moveLeft(leftStack);  // Move the left pointer forward
            } else {
                moveRight(rightStack); // Move the right pointer backward
            }
        }

        return false;
    }

    // Helper function to move the left pointer (next in in-order traversal)
    private static void moveLeft(Stack<TreeNode> stack) {
        TreeNode node = stack.pop();
        node = node.right;
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    // Helper function to move the right pointer (next in reverse in-order traversal)
    private static void moveRight(Stack<TreeNode> stack) {
        TreeNode node = stack.pop();
        node = node.left;
        while (node != null) {
            stack.push(node);
            node = node.right;
        }
    }
}