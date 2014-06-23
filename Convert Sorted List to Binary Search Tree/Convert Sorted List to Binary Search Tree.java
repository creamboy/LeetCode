/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null) return head;
        RandomListNode original=head;
        RandomListNode newhead=new RandomListNode(0);
        newhead.next=head;
        while(original!=null){
            RandomListNode copy=new RandomListNode(original.label);
            copy.next=original.next;
            original.next=copy;
            original=copy.next;
        }
        original=head;
        while(original!=null){
            if(original.random==null){
                original=original.next.next;
            }else{
                original.next.random=original.random.next;
                original=original.next.next;
            }
        }
        original=head;
        RandomListNode newh =newhead;
        while(original!=null){
            newh.next=original.next;
            original.next=original.next.next;
            newh=newh.next;
            original=original.next;
        }
        return newhead.next;
    }
}
