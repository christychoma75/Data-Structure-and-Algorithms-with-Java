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
        //start slw and fst pointer -> head
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(slowPointer != null && fastPointer != null && fastPointer.next != null){
            //advance both pointer
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            //check if both pointers meet then we have a cycle otherwise No cycle
            if(slowPointer == fastPointer){
                return true;
            }
        }
        return false;
    }
}