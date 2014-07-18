public class Solution {
    public int removeDuplicates(int[] A) {
        int newl = 0;
        for(int i = 0; i < A.length; i++) {
            if(i==A.length-1||newl == 0|| A[i] != A[i-1]||(A[i]==A[i-1]&&A[i]!=A[i+1])){
               A[newl++] = A[i]; 
            }
        }
        return newl;
    }
}
