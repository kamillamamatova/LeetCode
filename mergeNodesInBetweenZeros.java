/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        // Fixed pointer to return from
        ListNode newHead = new ListNode();
        // Tail pointer to build a new list
        ListNode tail = newHead;

        while(head != null){
            if(head.val == 0){ 
                // Moves past the 0 to start counting the sum
                head = head.next;
                int sum = 0;

                // Sums untils the next 0
                while(head != null && head.val != 0){
                    sum += head.val;
                    head = head.next;
                }

                // Only adds the sum if it had numbers in it
                if(sum > 0){
                    // Appends the sum node
                    tail.next = new ListNode(sum);
                    tail = tail.next;
                }
            }
        }

        // Without .next it would add 0 at the beginning
        return newHead.next;
        
        /*
        - Given: head of a linked list
            - Contains a series of ints separated by 0's
            - Beginning & end will have Node.val == 0
        Goal: For every 2 consecutive 0's, need to merge all the nodes between 
        them into a single node (value is the sum of all the merged nodes)
            - Modified list should not contain 0's
        Return: head of the modified linked list

        So have to keep track of the sum
        The sum will reset
        */
    }
}
