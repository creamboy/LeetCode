# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a list of lists of integers
    def levelOrder(self, root):
        result=[]
        level=[]
        level.append(root)
        while True:
            if not level:
                break
            if level[0]==None:
                break
            next=[]
            current=[]
            for node in level:
                current.append(node.val)
                if node.left:
                    next.append(node.left)
                if node.right:
                    next.append(node.right)
            result.append(current)
            level=next
        return result
