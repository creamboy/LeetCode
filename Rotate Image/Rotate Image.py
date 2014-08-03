class Solution:
    # @return an integer
    def uniquePaths(self, m, n):
        map=[0 for i in range(m+1)]
        map[1]=1
        for i in range(n):
            for j in range(1,m+1):
                map[j]+=map[j-1]
        return map[m]
        
        
