class Solution:
    # @param A a list of integers
    # @return an integer
    def removeDuplicates(self, A):
        newl=0
        for i in range(len(A)):
            if newl==0 or i==len(A)-1 or A[i]!=A[i-1] or A[i]==A[i-1] and A[i]!=A[i+1]:
                A[newl]=A[i]
                newl+=1
        return newl
