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
    public List<Double> averageOfLevels(TreeNode root) {
        // Where the averages for each level are kept
        List<Double> result = new ArrayList<>();

        // Base case
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            // What sum will be divided by to find the average of a level
            int levelSize = queue.size();
            double sum = 0;

            // Walks through a level and adds up all the node vals in its
            // level
            for(int i = 0; i < levelSize; i++){
                // The current node is the first one in the queue
                // First one added is the first one that gets removed
                TreeNode curNode = queue.poll();
                sum += curNode.val;

                // Queuing for the next level
                if(curNode.left != null){
                    queue.add(curNode.left);
                }
                if(curNode.right != null){
                    queue.add(curNode.right);
                }
            }

            // Adds the average to the array list
            result.add(sum / levelSize);
        }

        return result;

        /*
        - Given: root
        - Return: avg value of the nodes on each level in the form of an array

        This is Breadth First Search, since it's based on depth
        Queue is FIFO (first in first out)
        */
    }
}
