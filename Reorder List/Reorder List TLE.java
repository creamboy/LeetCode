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
  public void reorderList(ListNode head){
		if(head==null||head.next==null){
			return;
		}
		else{
			ListNode newhead=head;
			ListNode temp=newhead.next;
			ListNode prev=newhead;
			while(temp.next!=null){
				temp=temp.next;
				prev=prev.next;
			}
			ListNode t=prev.next;
			prev.next=t.next;
			t.next=newhead.next;
			newhead.next=t;
			reorderList(temp.next);
		}
  }
 }


