# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return an integer
    def minDepth(self, root):
        if not root:
            return 0
        l=self.minDepth(root.left)
        r=self.minDepth(root.right)
        if l==0 or r==0:
            return 1+r+l
        return min(l, r)+1
