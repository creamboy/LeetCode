public class Solution {
    public void rotate(int[][] matrix) {
    int n = matrix.length;
    for(int y=0;y<n/2;y++){
        for(int x=y;x < n-y-1;x++){
            int temp=matrix[y][x];
            temp=move(matrix,temp,(n-1)-y,x);
            temp=move(matrix,temp,(n-1)-x,(n-1)-y);
            temp=move(matrix,temp,y,(n-1)-x);
            temp=move(matrix,temp,x,y);
        }
    }
}
public int move(int[][]matrix,int val, int x, int y){
    int store = matrix[y][x];
    matrix[y][x]=val;
    return store;
}
}
