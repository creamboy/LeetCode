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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode prev=result;
        ListNode cur=result;
        int flag=0;
        while(l1!=null||l2!=null||flag!=0){
            int sum=0;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            if(cur==null){
                cur=new ListNode(0);
                prev.next=cur;
            }
            
            sum=sum+flag;
            cur.val=sum%10;
            flag=sum/10;
            prev=cur;
            cur=cur.next;
        }
        return result;
    }
}