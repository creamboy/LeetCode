# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a list node
    def detectCycle(self, head):
        slow=head
        fast=head
    #should split fast!=None and fast.next!=None here,
    #otherwise we will get "Nonetype has no attribute for .next error"
        while fast!=None:
            if fast.next!=None:
                slow=slow.next
                fast=fast.next.next
                if slow==fast:
                    slow=head
                    while slow!=fast:
                        slow=slow.next
                        fast=fast.next
                    return slow
            else:
                break
        return None
