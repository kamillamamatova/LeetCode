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
        ListNode quick = head;
        ListNode slow = head;

        // If either are null, then there's no cycle,
        // since these are the nodes being checked
        while(quick != null && quick.next != null){
            quick = ahead.next.next;
            slow = behind.next;

            // Eventually catches up if it's a loop,
            // like 2 people running endlessly in a circle, 
            // they'll start off at the same point,
            // the faster person will outrun the slower one,
            // and will reach the same start before the slower one,
            // and then eventully catch up to the slow person,
            // even though they're on different # of loops
            if(quick == slow){
                return true;
            }
        }

        return false;

        /*
        // Since hashsets store unique values
        HashSet visited = new HashSet<>();

        while(head != null){
            visited.add(head);

            // Next node
            head = head.next;

            // If the next node is already in the hashset,
            // then it's a cycle
            if(visited.contains(head)){
                return true;
            }
        }

        return false; */
    }
}
