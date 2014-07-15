# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a list node
    # @return a tree node
    def sortedListToBST(self, head):
        if not head:
            return None
        N = 0
        cur = head
        while cur:
            N += 1
            cur = cur.next
        A = self.listToBST(head, N)
        return A[0]

    def listToBST(self, head, N):
        if N == 1:
            return [TreeNode(head.val), head.next]
        l = self.listToBST(head, N/2)
        root = TreeNode(l[1].val)
        root.left = l[0]
        if (N-1)/2:
            r = self.listToBST(l[1].next, (N-1)/2)
            root.right = r[0]
            return [root, r[1]]
        else:
            return [root, l[1].next]
