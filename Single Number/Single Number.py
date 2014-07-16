class Solution:
    # @param A, a list of integer
    # @return an integer
    def singleNumber(self, A):
        result=0
        for i in range(len(A)):
            result=result or A[i]
        return result
            
