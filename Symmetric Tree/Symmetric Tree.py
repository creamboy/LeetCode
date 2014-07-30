# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a boolean
    def isSymmetric(self, root):
        if not root:
            return True
        s1=[]
        s2=[]
        s1.append(root.left)
        s2.append(root.right)
        while len(s1)!=0 and len(s2)!=0 :
            n1=s1.pop()
            n2=s2.pop()
            if not n1 and not n2:
                pass
            elif not n1 or not n2:
                return False
            elif n1.val!=n2.val:
                return False
            else:
                s1.append(n1.left)
                s2.append(n2.right)
                s1.append(n1.right)
                s2.append(n2.left)
        return True
