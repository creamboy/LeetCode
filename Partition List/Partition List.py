# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @param x, an integer
    # @return a ListNode
    def partition(self, head, x):
        newhead=ListNode(0)
        middle=ListNode(10000)
        n=newhead
        m=middle
        temp=head
        while temp:
            if temp.val<x:
                n.next=temp
                n=n.next
                temp=temp.next
            else:
                m.next=temp
                m=m.next
                temp=temp.next
        n.next=middle.next
        m.next=None
        return newhead.next
