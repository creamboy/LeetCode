# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @param m, an integer
    # @param n, an integer
    # @return a ListNode
    def reverseBetween(self, head, m, n):
        if not head or not head.next:
            return head
        else:
            newhead=ListNode(0)
            newhead.next=head
            p=newhead
            k=1
            while k<m:
                k=k+1
                p=p.next
            p1=p.next
            temp=p1
            while m<n:
                m=m+1
                temp=p1.next
                p1.next=temp.next
                temp.next=p.next
                p.next=temp
            return newhead.next
