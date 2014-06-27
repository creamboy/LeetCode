# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param a list of ListNode
    # @return a ListNode
    
    def mergeKLists(self, lists):
        if len(lists)<1:
            return lists
        while len(lists)>1:
            l1=lists.pop()
            l2=lists.pop()
            l=self.mergeTwoLists(l1, l2)
            lists.append(l)
        return lists.pop()
    def mergeTwoLists(self, l1, l2):
        if not l1:
            return l2
        if not l2:
            return l1
        else:
            newhead=ListNode(0)
            if l1.val<l2.val:
                index1=l1.next
                index2=l2
                current=l1
                newhead.next=current
            else:
                index2=l2.next
                index1=l1
                current=l2
                newhead.next=current
            while index1!=None and index2!=None:
                if index1.val<index2.val:
                    temp=ListNode(index1.val)
                    current.next=temp
                    current=temp
                    index1=index1.next
                else:
                    temp=ListNode(index2.val)
                    current.next=temp
                    current=temp
                    index2=index2.next
            if index1!=None:
                current.next=index1
            if index2!=None:
                current.next=index2
            return newhead.next
