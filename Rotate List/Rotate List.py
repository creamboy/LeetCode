# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @param k, an integer
    # @return a ListNode
    def rotateRight(self, head, k):
        if not head or k==0:
            return head
        else:
            newhead=ListNode(0)
            newhead.next=head
            prev=newhead
            tail=head
            n=1
            while tail.next:
                n=n+1
                tail=tail.next
                prev=prev.next
            m=0
            while m<k%n:
                prev=newhead
                tail=newhead.next
                while tail.next:
                    tail=tail.next
                    prev=prev.next
                m=m+1
                prev.next=None
                tail.next=newhead.next
                newhead.next=tail
            return newhead.next
