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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return buildBalanced(list, 0, list.size() - 1);
        /*
        - Given: root of a bst
        - Return: balanced bst w/ the same node values
        - A bst is balanced if the depth of the 2 subtrees
        of every node never differs by more than 1

        In order traversal

        Going to take out sorted values and then rebuild from
        the middle outward
        */
    }

    // Adding to the array list, which will be sorted
    private void inorder(TreeNode node, List<Integer> list){
        // Base case
        if(node == null){
            return;
        }

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    // Building the balanced tree from the array list, starting from the 
    // middle, and building and adding on from there
    private TreeNode buildBalanced(List<Integer> list, int left, int right){
        // Not BST
        // Base case
        if(left > right){
            return null;
        }

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = buildBalanced(list, left, mid - 1);
        root.right = buildBalanced(list, mid + 1, right);

        return root;
    }
}
