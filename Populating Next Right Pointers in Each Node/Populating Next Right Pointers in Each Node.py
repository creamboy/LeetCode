# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#         self.next = None

class Solution:
    # @param root, a tree node
    # @return nothing
    def connect(self, root):
        left=root
        while left:
            across=left
            while across:
                if across.left:
                    across.left.next=across.right
                if across.right and across.next:
                    across.right.next=across.next.left
                across=across.next
            left=left.left
            
