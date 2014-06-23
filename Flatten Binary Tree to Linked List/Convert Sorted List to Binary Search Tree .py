# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return nothing, do it in place
    prev=None
    def recursive(self,root):
        if root==None:
            return
        else:
            self.prev.right=root
            self.prev.left=None
            self.prev=root
            rootr=root.right
            Solution.recursive(self,root.left)
            Solution.recursive(self,rootr)
    def flatten(self, root):
        newhead=TreeNode(0)
        newhead.right=root
        self.prev=newhead
        Solution.recursive(self,root)
   
