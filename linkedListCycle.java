/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Since hashsets store unique values
        HashSet visited = new HashSet<>();

        while(head != null){
            visited.add(head);

            // If the next node is already in the hashset,
            // then it's a cycle
            if(visited.contains(head.next)){
                return true;
            }

            // Next node
            head = head.next;
        }

        return false;
    }
}
