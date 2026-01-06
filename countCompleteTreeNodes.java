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
    public int countNodes(TreeNode root) {
        // Base case
        if(root == null){
            return 0;
        }

        // 1 for the first node, root, and then add 1 for each node checked
        // since it's an int type it returns a #, which would be 1 for each
        // node checked
        return 1 + countNodes(root.left) + countNodes(root.right);

        /*
        - Given: root of a complete binary tree
        - Return: # of nodes in the tree
        */
    }
}
