# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a list of integers
    def inorderTraversal(self, root):
        list=[]
        stack=[]
        temp=root
        while stack or temp:
            if temp:
                stack.append(temp)
                temp=temp.left
            else:
                temp=stack.pop()
                list.append(temp.val)
                temp=temp.right
        return list
