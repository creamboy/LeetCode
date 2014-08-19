# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @param sum, an integer
    # @return a list of lists of integers
    def pathSum(self, root, sum):
        stack=[]
        res=[]
        self.search(root, sum, stack, res)
        return res
    def search(self, root, sum, stack, res):
        if not root:
            return
        stack.append(root.val)
        if not root.left and not root.right:
            if root.val==sum:
                ans=[]
                for item in stack:
                    ans.append(item)
                res.append(ans)
        else:
            self.search(root.left, sum-root.val, stack, res)
            self.search(root.right, sum-root.val, stack, res)
        stack.pop()
                

