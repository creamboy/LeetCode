# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param num, a list of integers
    # @return a tree node
    def sortedArrayToBST(self, num):
        if len(num)==0:
            return None
        return self.ArrayToBST(num, len(num))
    
    def ArrayToBST(self, num, n):
        if n==1:
            return TreeNode(num[0])
        if n==2:
            root=TreeNode(num[1])
            left=TreeNode(num[0])
            root.left=left
            return root
        else:
            numl=[num[i] for i in range(n/2)]
            numr=[[num[j] for j in range(n/2+1,n)]
            l=self.ArrayToBST(numl, n/2)
            r=self.ArrayToBST(numr, (n-1)/2)
            root=TreeNode(num[n/2])
            root.left=l
            root.right=r
            return root
