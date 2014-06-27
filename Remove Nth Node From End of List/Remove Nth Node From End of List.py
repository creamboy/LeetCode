# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @return a ListNode
    def removeNthFromEnd(self, head, n):
        m=1
        fast=head
        while m<n:
            m=m+1
            fast=fast.next
        slow=head
        newhead=ListNode(0)
        newhead.next=head
        prev=newhead
        while fast.next:
            prev=prev.next
            slow=slow.next
            fast=fast.next
        if slow.next:
            slow.val=slow.next.val
            slow.next=slow.next.next
        else:
            prev.next=None
        return newhead.next
