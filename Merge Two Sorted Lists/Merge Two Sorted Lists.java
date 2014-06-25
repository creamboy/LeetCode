/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode curr = new ListNode((l1.val < l2.val ? l1.val : l2.val));
        ListNode head = curr;
        ListNode index1 = l1.val < l2.val ? l1.next : l1;
        ListNode index2 = l1.val < l2.val ? l2: l2.next;
        while(index1 != null && index2 != null) {
            if(index1.val < index2.val) {
                ListNode temp = new ListNode(index1.val);
                curr.next = temp;
                curr = temp;
                index1 = index1.next;
            } else {
                ListNode temp = new ListNode(index2.val);
                curr.next = temp;
                curr = temp;
                index2 = index2.next;
            }
        }
        if(index1 != null) curr.next = index1;
        if(index2 != null) curr.next = index2;
        return head;
    }
}
