class Solution:
    # @param n, an integer
    # @return an integer
    def climbStairs(self, n):
        if n<0:
            return 0
        s=[0 for i in range(n+1)]
        s[0]=1
        s[1]=1
        for i in range(2,n+1):
            s[i]=s[i-1]+s[i-2]
        return s[n]
