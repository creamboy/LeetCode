class Solution:
    # @param grid, a list of lists of integers
    # @return an integer
    def minPathSum(self, grid):
        m=len(grid)
        n=len(grid[0])
        opt=[9999999 for i in range(n+1)]
        opt[1]=0
        for i in range(m):
            for j in range(n):
                opt[j+1]=min(opt[j+1], opt[j])+grid[i][j]
        return opt[n]
