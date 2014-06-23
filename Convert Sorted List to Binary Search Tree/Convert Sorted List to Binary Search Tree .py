# Definition for singly-linked list with a random pointer.
# class RandomListNode:
#     def __init__(self, x):
#         self.label = x
#         self.next = None
#         self.random = None

class Solution:
    # @param head, a RandomListNode
    # @return a RandomListNode
    def copyRandomList(self, head):
        if head==None:
            return head;
        original=head
        newhead=RandomListNode(0)
        newhead.next=head
        while original!=None:
            copy=RandomListNode(original.label)
            copy.next=original.next
            original.next=copy
            original=copy.next
        original=head
        while original!=None:
            if original.random==None:
                original=original.next.next
            else:
                original.next.random=original.random.next;
                original=original.next.next
        original=head
        newh=newhead
        while original!=None:
            newh.next=original.next
            original.next=original.next.next
            newh=newh.next
            original=original.next
        return newhead.next
            
