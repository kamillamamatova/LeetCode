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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode(-1);
        ListNode cur = mergedList;
        ListNode cur1 = list1;
        ListNode cur2 = list2;

        // While both loops aren't empty
        while(cur1 != null && cur2 != null){

            if(cur1.val <= cur2.val){
                cur.next = cur1;
                // Moves on to the next pointer in the ll
                cur1 = cur1.next;
            }
            else{
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }

        // For any of the remainders left in either linked list,
        // since the while loop stops once one of the linked lists is empty
        if(cur1 != null){
            cur.next = cur1;
        }
        if(cur2 != null){
            cur.next = cur2;
        }

        // Returns the head
        return mergedList.next;
    }
}
