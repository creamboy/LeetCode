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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0) return head;
        ListNode newhead=new ListNode(0);
        newhead.next=head;
        ListNode prev=newhead;
        ListNode tail=head;
        int n=1;
        while(tail.next!=null){
            n++;
            tail=tail.next;
            prev=prev.next;
        }
        int m=0;
        while(m<k%n){
            prev=newhead;
            tail=newhead.next;
            while(tail.next!=null){
                tail=tail.next;
                prev=prev.next;
            }
            m++;
            prev.next=null;
            tail.next=newhead.next;
            newhead.next=tail;
        }
        return newhead.next;
    }
}
