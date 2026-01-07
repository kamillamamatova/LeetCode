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
    public TreeNode sortedArrayToBST(int[] nums) {
        // Base case
        if(nums == null || nums.length == 0){
            return null;
        }

        // low & high
        return build(nums, 0, nums.length - 1);

        /*
        - Given: int array nums (sorted)
        - Goal: Convert to a height balanced bst

        Divide and conquer
        */
    }

    private TreeNode build(int[] nums, int low, int high){
        // Base case
        if(low > high){
            return null;
        }

        int mid = (high + low) / 2;
        // root is the value in the middle
        TreeNode root = new TreeNode(nums[mid]);

        // Builds the left side of the bst
        // All values are less than root
        root.left = build(nums, low, mid - 1);
        // Builds the right side of the bst
        // All values are greater than root
        root.right = build(nums, mid + 1, high);

        // Returns the subtree that was built
        return root;

        /*
        Ex: [-10, -3, 0, 5, 9]
        call 1: mid = 2 / 2 = 2 -> 0
        call 2: root.left mid = 1 / 2 = 0 -> -10
        call 3 & 4: right of -10 is -3
        call 5: root.right mid = 7 / 2 = 3 -> 5
        call 6: right of 5 is 9
        */
    }
}
