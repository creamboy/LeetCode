class Solution:
    # @param A a list of integers
    # @param target an integer
    # @return a boolean
    def search(self, A, target):
        l=0
        r=len(A)-1
        while l<=r:
            m=l+(r-l)/2
            if A[m]==target:
                return True
            if A[l]<A[m]:
                if A[l]<=target and target<A[m]:
                    r=m-1
                else:
                    l=m+1
            elif A[l]>A[m]:
                if A[m]<target and target<=A[r]:
                    l=m+1
                else:
                    r=m-1
            else:
                l=l+1
        return False
