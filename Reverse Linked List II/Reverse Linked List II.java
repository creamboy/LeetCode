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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null || head.next==null) return head;

        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode p = newhead;
        int k = 1;
        while(k++<m) p = p.next;
        ListNode p1 = p.next;
        ListNode temp = p1;
        while(m++<n) {
            temp = p1.next;
            p1.next = temp.next;
            temp.next = p.next;
            p.next = temp;
        }
        return newhead.next;
    }
}
