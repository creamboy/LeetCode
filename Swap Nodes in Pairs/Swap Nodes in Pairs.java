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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        } 
        ListNode newhead=new ListNode(0);
        newhead.next=head;
        for(ListNode temp=newhead;temp.next!=null&&temp.next.next!=null;temp=temp.next.next){
            temp.next=swap(temp.next,temp.next.next);
        }
        return newhead.next;
    }
    
    ListNode swap(ListNode first, ListNode second){
        first.next=second.next;
        second.next=first;
        return second;
    }
}
