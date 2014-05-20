# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a ListNode
    def deleteDuplicates(self, head):
        temp=head
        while temp!=None:
            if temp.next!=None:
                future=temp
                while future.val==future.next.val:
                    future.next=future.next.next
                    if future.next==None:
                        break
                temp=temp.next
            else:
                break
        return head
