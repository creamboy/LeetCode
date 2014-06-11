# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a list of integers
    def preorderTraversal(self, root):
        stack=[None]
        preorder=[]
        temp=root
        while temp!=None:
            preorder.append(temp.val)
            if temp.right!=None:
                stack.append(temp.right)
            if temp.left!=None:
                stack.append(temp.left)
            temp=stack.pop()
        return preorder
