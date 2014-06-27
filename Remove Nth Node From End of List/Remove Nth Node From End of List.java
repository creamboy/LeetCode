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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int m=1;
        ListNode slow=head;
        ListNode newhead=new ListNode(0);
        ListNode fast=head;
        while(m<n){
            m++;
            fast=fast.next;
        }
        newhead.next=head;
        ListNode prev=newhead;
        while(fast.next!=null){
            prev=prev.next;
            fast=fast.next;
            slow=slow.next;
        }
        if(slow.next!=null){
            slow.val=slow.next.val;
            slow.next=slow.next.next;
        }else{
            prev.next=null;
        }
        return newhead.next;
    }
}
