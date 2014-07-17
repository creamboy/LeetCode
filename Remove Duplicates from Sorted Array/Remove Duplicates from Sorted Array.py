class Solution:
    # @param a list of integers
    # @return an integer
    def removeDuplicates(self, A):
        newl=0
        for i in range(len(A)):
            if newl==0 or A[i]!=A[i-1]:
                A[newl]=A[i]
                newl+=1
        return newl
