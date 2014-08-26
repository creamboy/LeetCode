class Solution:
    # @param obstacleGrid, a list of lists of integers
    # @return an integer
    def uniquePathsWithObstacles(self, obstacleGrid):
        m=len(obstacleGrid)
        if not m:
            return 0
        n=len(obstacleGrid[0])
        if not n:
            return 0
        res=[0 for i in range(n+1)]
        res[1]=1
        for i in range(m):
            for j in range(1,n+1):
                if not obstacleGrid[i][j-1]:
                    res[j]=res[j-1]+res[j]
                else:
                    res[j]=0
                    
        return res[n]
