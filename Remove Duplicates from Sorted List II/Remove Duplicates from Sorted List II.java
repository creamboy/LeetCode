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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
           ListNode future=temp;
           while(future.next!=null){
               if(temp.val==future.next.val){
                   future.next=future.next.next;
               }else{
                   future=future.next;
               }
           }
           temp=temp.next;
        }
        return head;
    }
}
