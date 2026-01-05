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
    // Sets up the problem and calls the helper
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case
        if(root == null){
            return false;
        }

        return backtrackingPath(root, 0, targetSum);

        /* 
        - Given: root & int targetSum
        - Return: true if the tree has a root to leaf path, where ading up
        all the values in the path = targetSum

        Helper function again
        There only needs to be one root to leaf path that equal
        targetSum
        
        This is backtracking, if a path doesn't equal to targetSum, then
        can go back to a visited parent, and see if it has any univisted
        children, and check if sum equals targetSum

        This is also depth first search

        So, binary tree traversal + backtracking + dfs
        */
    }

    public boolean backtrackingPath(TreeNode a, int sum, int targetSum){
        // Base case
        if(a == null){
            return false;
        }

        sum += a.val;

        // Checks whether a node is a leaf
        if(a.left == null && a.right == null){
            return sum == targetSum;
        }

        // Tries one path, and then the other 
        // So returns true if either left or right path works
        return backtrackingPath(a.left, sum, targetSum) || backtrackingPath(a.right, sum, targetSum);
    }
}
