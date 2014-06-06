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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
			return head;
		// count total number of elements
		int count = 0;
		ListNode p = head;
		while (p != null) {
			count++;
			p = p.next;
		}
 
		// break up to two list
		int middle = count / 2;
 
		ListNode l = head, r = null;
		ListNode p2 = head;
		int countHalf = 0;
		while (p2 != null) {
			countHalf++;
			ListNode next = p2.next;
 
			if (countHalf == middle) {
				p2.next = null;
				r = next;
			}
			p2 = next;
		}
 
		// now we have two parts l and r, recursively sort them
		ListNode h1 = sortList(l);
		ListNode h2 = sortList(r);
 
		// merge together
		ListNode merged = merge(h1, h2);
 
		return merged;
	}
    public ListNode merge(ListNode l, ListNode r){
        ListNode lp = l, rp = r;
        ListNode newhead = new ListNode(-1);
        ListNode cur = newhead;

        while(lp!=null || rp!=null){
            if(lp==null){
                cur.next = rp;
                break;
            }else if(rp==null){
                cur.next = lp;
                break;
            }else{
                if(lp.val <= rp.val){
                    cur.next = lp;
                    lp = lp.next;
                    cur = cur.next;
                }else {
                    cur.next = rp;
                    rp = rp.next;
                    cur = cur.next;
                }
            }
        }
        return newhead.next;
    }
}
