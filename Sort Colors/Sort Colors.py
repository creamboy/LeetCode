class Solution:
    # @param A a list of integers
    # @return nothing, sort in place
    def sortColors(self, A):
        index=[-1,-1,-1]
        for i in range(len(A)):
            if A[i]==0:
                index[0]+=1
                index[1]+=1
                index[2]+=1
                A[index[2]]=2
                A[index[1]]=1
                A[index[0]]=0
            elif A[i]==1:
                index[1]+=1
                index[2]+=1
                A[index[2]]=2
                A[index[1]]=1
            elif A[i]==2:
                index[2]+=1
                A[index[2]]=2
