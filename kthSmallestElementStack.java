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
    public int kthSmallest(TreeNode root, int k) {
        // FILO
        Stack<TreeNode> stack = new Stack<>();

        // Base case
        if(root == null){
            return 0;
        }

        while(true){
            // Pushes the left nodes first
            while(root != null){
                stack.push(root);
                root = root.left;
            }

            // Pops them out until it reaches the kth index
            root = stack.pop();
            k--;
            if(k == 0){
                return root.val;
            }

            // Checks the right node and pushes it in when the loop restarts
            root = root.right;
        }
    }
}
