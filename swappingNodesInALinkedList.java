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
    public ListNode swapNodes(ListNode head, int k) {
        // Pointers to find kth node from beginning
        // and the end
        ListNode fast = head;
        ListNode slow = head;

        // Nodes that are kth node from beginning, 
        // and at end
        // Will use this nodes instead of fast and
        // slow because fast will be modified trying
        // to find the end node
        ListNode begin = head;
        ListNode end = head;

        // Finds the kth node from the beginning
        for(int i = 1; i < k; i++){
            fast = fast.next;
        }

        // Saves the kth node from the beginning
        begin = fast;

        // Loops till the end of the linked list
        // and uses fast to do it, since it start at
        // k, and slow will traverse at the same time,
        // except it start at the beginning,
        // so at the end, the slow pointer will be
        // pointing to the kn node from the end
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        end = slow;

        // Switches the node values
        int tmp = begin.val;
        begin.val = end.val;
        end.val = tmp;

        return head;

        /*
        - Given: head of a linked list & int k
        - Return: head of a linked list after swapping the values of the kth
        node from the beginning and the kth node from the end
            - list is 1 indexed

        This can be a fast and slow pointer solution

        Ex: [1, 2, 3, 4, 5], k = 2
        fast = head;
        fast.val = 1

        fast = fast.next;
        fast.val = 2
        Loop ends because if i is incremented, it'll = k

        begin = fast
        begin.val = 2

          _   _ 
        1 2 3 4 5

        fast needs to reach end of linked list
        fast is starting at position k
        slow is starting at head, positin 1
        So to find kth node from the end, fast starting ahead
        will make slow reach the ktn node from the end because
        it'll reach null as slow is k away from the null (end)
        slow and fast are pointers

        Then they need to be swapped, begin with end
        */
    }
}
