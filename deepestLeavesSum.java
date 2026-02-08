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
    private int sum = 0;
    private int maxDepth = -1;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);

        return sum;

        /*
        - Given: root of a binary tree
        - Return: sum of values of its deepest leaves

        So if a node doesn't have a child, and its parent node's
        other child doesn't have a child

        Should pay attention to depth
        */
    }

    private void dfs(TreeNode node, int depth){
        // Base case
        if(node == null){
            return;
        }

        // If a deeper level has been found
        if(depth > maxDepth){
            // Replaces the max depth w/ current depth
            maxDepth = depth;
            // Resets sum since the new max depth has been found
            sum = node.val;
        }
        else if(depth == maxDepth){
            // Adds on to the sum
            sum += node.val;
        }

        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
