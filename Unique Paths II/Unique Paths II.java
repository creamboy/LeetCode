public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        if(m==0) return 0;
        int n=obstacleGrid[0].length;
        if(n==0) return 0;
        int[] res=new int[n+1];
        res[1]=1;
        for(int i=0;i<m;i++){
            for(int j=1;j<=n;j++){
                if(obstacleGrid[i][j-1]==0){
                    res[j]=res[j-1]+res[j];
                }else{
                    res[j]=0;
                }
            }
        }
        return res[n];
    }
}
