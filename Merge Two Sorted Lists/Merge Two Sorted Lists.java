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
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode newhead=new ListNode(0);
        ListNode index1;
        ListNode index2;
        ListNode current;
        if(l1.val<l2.val){
            index1=l1.next;
            index2=l2;
            current=l1;
            newhead.next=current;
        }else{
            index2=l2.next;
            index1=l1;
            current=l2;
            newhead.next=current;
        }
        while(index1!=null&&index2!=null){
            if(index1.val<index2.val){
                ListNode temp=new ListNode(index1.val);
                current.next=temp;
                current=temp;
                index1=index1.next;
            }else{
                ListNode temp=new ListNode(index2.val);
                current.next=temp;
                current=temp;
                index2=index2.next;
            }
        }
        if(index1!=null){
            current.next=index1;
        }
        if(index2!=null){
            current.next=index2;
        }
        return newhead.next;
    }
}
