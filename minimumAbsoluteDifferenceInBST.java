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
    private Integer prev = null;
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);

        return min;
    }

    public int inorder(TreeNode a){
        if(a == null){
            return min;
        }

        inorder(a.left);

        if(prev != null){
            min = Math.min(min, a.val - prev);
        }
        prev = a.val;

        inorder(a.right);
        
        return min;
    }
}


/*
    - Given: root of a bst
    - Return: min abs difference between values of any 2 diff nodes

    DFS since i need to find a min and it's a bst, so the node closest to
    another node is the one that needs to be subtracted from to find a min
    difference, so it won't be looking for a difference between every 
    single node which would not be effecient

    So, DFS, i will be utilizing stacks, and backtracking

    so maybe something like, root, then left of root if it's not null.
    then left of root again if it's not null, and if it is null, then pop
    the leaf and find the difference, and then backtrack to previous node
    before leaf, and if it has a right child go to that and if that's a 
    leaf then find the difference and pop that node and backtrack to that
    node which is a leaf (not actually) but since its children have been
    popped, so pop that, and backtrack to its parent and find the 
    difference and see if the parent has a child, and the process goes on,
    until the stack is empty
*/

/*  int min = 110;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){
        TreeNode curNode = queue.poll();

        if(curNode.left != null){
            queue.add(curNode.left);
            TreeNode nextNode = queue.poll();
            if(Math.abs(curNode.val - nextNode.val) < min){
                min = Math.abs(curNode.val - nextNode.val);
            }
            curNode = nextNode;
        }
        if(curNode.right != null){
            queue.add(curNode.right);
            TreeNode nextNode = queue.poll();
            if(Math.abs(curNode.val - nextNode.val) < min){
                min = Math.abs(curNode.val - nextNode.val);
            }
            curNode = nextNode;
        }
    }

    return min;
*/
