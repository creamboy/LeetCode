# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a ListNode
    def insertionSortList(self, head):
        if not head:
            return head
        newhead = ListNode(0)
        newhead.next = head
        j = head
        while j.next:
            if j.next.val < j.val:
                i = newhead
                while i.next.val < j.next.val:
                    i = i.next
                temp = j.next
                j.next = temp.next #important
                temp.next = i.next
                i.next = temp
            else:
                j = j.next
        return newhead.next
