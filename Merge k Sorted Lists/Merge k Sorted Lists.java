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
    public ListNode mergeKLists(List<ListNode> lists) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for(ListNode x : lists) {
            while(x!=null) {
                heap.add(x.val);
                x = x.next;
            }
        }

        if(heap.isEmpty() || lists.isEmpty()) return null;

        ListNode result = new ListNode(heap.remove());
        ListNode first = result;
        int counter = heap.size();
        for(int i=0; i<counter; i++) {
            result.next = new ListNode(heap.remove());
            result = result.next;
        }
        return first;
    }
}
