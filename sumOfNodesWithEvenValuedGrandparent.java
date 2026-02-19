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
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root, null, null);

        /*
        - Given: root of a binary tree
        - Return: sum of values of nodes w/ an even valued
        grandparent
            - If there aren't any, return 0

        root.left.left or root.left.right or 
        root.right.left ot root.right.right
        */
    }

    private int dfs(TreeNode node, TreeNode parent, TreeNode grandparent){
        // Base case
        if(node == null){
            return 0;
        }

        int sum = 0;

        // Grandparent has to be even and not null
        if(grandparent != null && grandparent.val % 2 == 0){
            // Then add the sum of the current node
            sum += node.val;
        }

        // Recurses left and right
        // New grandparent is the current parent
        // and new parent is the current node
        sum += dfs(node.left, node, parent);
        sum += dfs(node.right, node, parent);

        return sum;
    }
}
