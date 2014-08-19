class Solution:
    # @param x, a float
    # @param n, a integer
    # @return a float
    def pow(self, x, n):
        if n<0:
            return 1.0/self.helper(x, -n)
        return self.helper(x, n)
    def helper(self, x, n):
        if n==0:
            return 1
        v=self.helper(x, n/2)
        if n%2==0:
            return v*v
        return v*v*x
