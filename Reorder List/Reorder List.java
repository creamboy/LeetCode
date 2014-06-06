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
   public void reorderList(ListNode head) {
    if (head == null) return;
    int length = 1;
    ListNode pointer = head;
    while (pointer.next != null) {
        length++;
        pointer = pointer.next;
    }
    reorder(head, length);
 }

private ListNode reorder(ListNode head, int length) {
    ListNode tail = head;
    if (length > 2) {
        tail = reorder(head.next, length - 2);
    } else if (length == 2) {
        return head.next;
    } else {
        return head;
    }

    ListNode t = tail.next;
    tail.next = t.next;
    t.next = head.next;
    head.next = t;
    return tail;   
 }
}
