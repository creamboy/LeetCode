class Solution:
    # @param A, a list of integers
    # @param target, an integer to be searched
    # @return an integer
    def search(self, A, target):
        return self.searchnow(A, target, 0, len(A)-1)
        
    def searchnow(self, A, target, low, high):
        mid=(low+high)/2
        if A[mid]==target:
            return mid
        if low>high :
            return -1
        if A[low]<=A[mid] :
            if target>=A[low] and target<A[mid] :
                return self.searchnow( A, target, low, mid-1)
            else:
                return self.searchnow( A, target, mid+1, high)
        elif A[mid]<=A[high] :
            if target>A[mid] and target<=A[high] :
                return self.searchnow( A, target, mid+1, high)
            else:
                return self.searchnow( A, target, low, mid-1)
        return -1
