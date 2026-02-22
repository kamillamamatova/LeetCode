/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        // Base case
        if(original == null){
            return null;
        }

        // If it reaches target
        // Original and cloned are moving together
        if(original == target){
            return cloned;
        }

        // Searches through the left subtree
        TreeNode leftAnswer = getTargetCopy(original.left, cloned.left, target);
        if(leftAnswer != null){
            return leftAnswer;
        }

        // Searches through the right subtree
        return getTargetCopy(original.right, cloned.right, target);

        /*
        - Given: 2 binary trees original & cloned & reference to a node target
        - Cloned tree is a copy of the original tree
        - Return: reference to the same node in the cloned tree

        There isn't a root
        */
    }
}
