public class Solution {
    public int uniquePaths(int m, int n) {
        int[] map=new int[m+1];
        map[1]=1;
        for(int i=0; i<n; i++){
            for(int j=1; j<=m; j++)
                map[j] = map[j-1]+map[j];
        }
        return map[m];
    }
}
