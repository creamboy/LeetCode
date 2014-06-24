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
    public ListNode partition(ListNode head, int x) {
        ListNode newhead = new ListNode(0);
        ListNode n=newhead;
        ListNode middle=new ListNode(10000);
        ListNode m=middle;
        ListNode temp=head;
        while(temp!=null) {
            if(temp.val<x){
                n.next=temp;
                n=n.next;
                temp=temp.next;
            }else{
                m.next=temp;
                m=m.next;
                temp=temp.next;
            }
        }
        m.next=null;
        n.next=middle.next;
        return newhead.next;
    }
    
}
