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
        // Base case 1
        // If the roots are both null, return true
        // since they're the same, and it's the end of the tree
        if(q == null && p == null){
            return true;
        }

        // Base case 2
        // If either one of the roots is null,
        // then it's false since the other one isn't
        if(p == null || q == null){
            return false;
        }

        // Base case 3
        // If values differ, but neither are null
        if(p.val != q.val){
            return false;
        }

        // Travering through the trees
        // Only true or false
        boolean checkLeft = isSameTree(p.left, q.left);
        boolean checkRight = isSameTree(p.right, q.right);

        // Runs the recursive funcs
        return checkLeft && checkRight;
    }
}
