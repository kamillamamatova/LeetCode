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
    public int rangeSumBST(TreeNode root, int low, int high) {
        // Base case
        if(root == null){
            return 0;
        }

        // Root on the left of root will be even less,
        // so looks into the right of root
        if(root.val < low){
            return rangeSumBST(root.right, low, high);
        }

        // Root on the right of root will be even more,
        // so looks into the left of root
        if(root.val > high){
            return rangeSumBST(root.left, low, high);
        }

        // if it is within the inclusive range, then add that root and then look into the others
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);

        /*
        - Given: root node of a bst & 2 ints low & high
        - Return: sum of values of all nodes w/ a value in the
        inclusive range [low, high]

        Ex:
             10
          5     15
        3   7      18

        root.val is 10
        10 is not less than 7 & it's not more than 15
        10 + rangeSumBST(root.left, ...) + rangeSumBST(root.right, ...)
        root.val(left) is 5
        5 is less than 7
        Look into the right child instead of left because it'll
        be even less than 5
        root.val is 7
        7 is not less than 7 & it's not more than 15
        7 + rangeSumBST(root.left, ...) + rangeSumBST(root.right, ...)
        which is null
        7 + 0 + 0
        so rangeSumBST(root.left) has been completed fully
        now look into the right of node value 10
        root.val(right) is 15
        15 isn't less than 7 and isn't more than 15
        15 + rangeSumBST(root.left, ...) + rangeSumBST(root.right, ...)
        root.left of 15 doesn't exist, so
        15 + 0 + rangeSumBST(root.right, ...)
        root.val(right) is 18
        18 isn't less than 7, but it's more than 15
        so, rangeSumBST(root.left, ...) which is null
        */
    }
}
