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
    public boolean isSymmetric(TreeNode root) {
        // Base case
        if(root == null){
            return true;
        }

        return isMirror(root.left, root.right);

        /*
        - Given: root of a binary tree
        - Check: is it a mirror of itself?

        Since it's checking if it mirrors itself, that means that if a parent
        has 2 children, the parent on the left side will have a different
        left and right than then parent on right side
        It's basically reflecting over an axix, rather than transitioning
        So then maybe, i would have to label the left and right differently,
        but I don't know if that would work
        probably won't, since this is recursion, so left and right has to stay
        the same, no matter what
        
        Okay, I think i'm gonna have to add a helper, because i have too many
        null checks and they're also too long
        */
    }

    // Helper function
    public boolean isMirror(TreeNode a, TreeNode b){
        // If they're both null, then true
        if(a == null && b == null){
            return true;
        }
        
        // If they're not both null, but one of them is, then false since
        // they're not the same
        if(a == null || b == null){
            return false;
        }

        // If they're not the same value, which they have to be for them
        // to be symmetric, then false
        if(a.val != b.val){
            return false;
        }

        // Checks each level at the same time, and are opposite directions
        // since it's a reflection not a transition
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}
