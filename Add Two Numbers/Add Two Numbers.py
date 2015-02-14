# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @return a ListNode
    def addTwoNumbers(self, l1, l2):
        result = ListNode(0)
        flag = 0
        prev = cur = result
        while l1 or l2 or flag:
            sum = 0
            if l1:
                sum += l1.val
                l1 = l1.next

            if l2:
                sum += l2.val
                l2 = l2.next
        
            if not cur:
                cur = ListNode(0)
                prev.next = cur
    
            sum += flag
            cur.val = sum % 10
            flag = sum / 10
            
            prev = cur
            cur = cur.next

        return result
            
            
