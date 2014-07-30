# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a boolean
    def isBalanced(self, root):
        if not root:
            return True
        left=self.maxDepth(root.left)
        right=self.maxDepth(root.right)
        if abs(left-right)>1:
            return False
        else:
            return self.isBalanced(root.right) & self.isBalanced(root.left)
    def maxDepth(self, root):
         if not root:
            return 0
         else:
            return max(self.maxDepth(root.left),self.maxDepth(root.right))+1 
