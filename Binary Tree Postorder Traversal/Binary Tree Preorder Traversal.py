# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a list of integers
    def postorderTraversal(self, root):
        stack=[]
        postorder=[]
        temp=root
        lastvisit=None
        while len(stack)!=0 or temp!=None:
            if temp!=None:
                stack.append(temp)
                temp=temp.left
            else:
                peeknode=stack[-1]
                if peeknode.right!=None and lastvisit!=peeknode.right:
                    temp=peeknode.right
                else:
                    stack.pop()
                    postorder.append(peeknode.val)
                    lastvisit=peeknode
        return postorder
