# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param a ListNode
    # @return a ListNode
    def swapPairs(self, head):
        newhead = ListNode(0)
        newhead.next = head
        pre=newhead
        cur =head
        while cur and cur.next:
            pre.next = cur.next
            cur.next = pre.next.next
            pre.next.next = cur
            pre = cur
            cur = cur.next
        return newhead.next
