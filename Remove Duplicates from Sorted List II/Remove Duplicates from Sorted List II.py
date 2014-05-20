# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class newNode:
    def _init_(self):
        self.next=None
class Solution:
    # @param head, a ListNode
    # @return a ListNode
    def deleteDuplicates(self, head):
            previous=newNode()
            previous.next=head
            newhead=previous
            temp=newhead
            while temp.next!=None:
                future=temp.next
                while future.next!=None:
                    if future.next.val==future.val:
                        future=future.next
                    else:
                        break
                if future!=temp.next:
                    temp.next=future.next
                else:
                    temp=temp.next
            return newhead.next
