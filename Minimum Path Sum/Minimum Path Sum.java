public class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(m==0||n==0) return 0;
        int[] opt=new int[n+1];
        for(int i=0;i<opt.length;i++){
            opt[i]=java.lang.Integer.MAX_VALUE;
        }
        opt[1]=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                opt[j+1]=Math.min(opt[j], opt[j+1])+grid[i][j];
            }
        }
        return opt[n];
    }
}
