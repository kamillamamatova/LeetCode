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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // Base case
        if(nums == null){
            return null;
        }

        return build(nums, 0, nums.length - 1);

        /*
        - Given: int array nums w/out duplicates
        - Max binary tree can be built recursively from nums
            1. Create a root node whose value is the max value
            in nums
            2. Recursively build the left subtree on the subarray
            prefix to the left of the max value
            3. Recursively build the right subtree on the subarray
            suffix to the right of the max value

        Wait the nums array isn't even sorted, so I should
        probably sort it first, the build from them, basically like
        the problem I just did
        Oh wait nevermind, this isn't balanced and I should keep
        nums the way it is and just build off that

        Ex: nums = [3, 2, 1, 6, 0 5]
        max # in nums = 6 (index = 3)
        So what you go on the complete opposite side
        like index 0 and index 5
        and then go inwards from there?
        if a # is on the left of max # in nums
        then after index 0 is placed, everything following that
        will be placed on the root.right of it, and it will continue
        and the opposite for the #s on the right side of max #
        once the first node is place (index nums.length - 1) everything
        else will be placed on the left of it

        So maybe a stack would be good
        FILO (first in last out)
        */
    }

    private TreeNode build(int[] nums, int left, int right){
        // Base case
        if(left > right){
            return null;
        }

        // Finds the index of the max #
        int maxIdx = left;
        for(int i = left + 1; i <= right; i++){
            if(nums[i] > nums[maxIdx]){
                maxIdx = i;
            }
        }

        // The root is the max #
        TreeNode root = new TreeNode(nums[maxIdx]);

        // Builds the left side (the #s on the left side of the array)
        root.left = build(nums, left, maxIdx - 1);
        // Builds the right side (the #s on the right side of the array)
        root.right = build(nums, maxIdx + 1, right);

        return root;
    }
}
