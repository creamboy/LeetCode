# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return an integer
    def sumNumbers(self, root):
        if not root:
            return 0
        else:
            return self.helper(root,0)
    def helper(self, root, x):
        if not root.right and not root.left:
            return 10*x+root.val
        val=0
        if root.right:
            val+=self.helper(root.right, 10*x+root.val)
        if root.left:
            val+=self.helper(root.left, 10*x+root.val)
        return val
