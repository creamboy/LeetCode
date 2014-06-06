# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return nothing
    def reorderList(self, head):
        if head==None:
            return
        else:
            len=1
            temp=head
            while temp.next:
                len=len+1
                temp=temp.next
            self.reorder(head, len)
    def reorder(self, head, len):
        tail=head
        if len>2:
            tail=self.reorder(head.next, len-2)
        elif len==2:
            return head.next
        else:
            return head
        temp=tail.next
        tail.next=temp.next
        temp.next=head.next
        head.next=temp
        return tail
       
        
        
