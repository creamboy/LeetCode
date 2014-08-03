public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int index=0;
       while(target>matrix[index][0]&&index!=matrix.length-1){
           index++;
       }
       if(target<matrix[index][0]&&index!=0){
           index--;
       }
       for(int i=0;i<matrix[index].length;i++){
           if(target==matrix[index][i]) return true;
       }
       return false;
    }
}
