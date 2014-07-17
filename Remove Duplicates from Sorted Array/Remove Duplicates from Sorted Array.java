public class Solution {
    public int removeDuplicates(int[] A) {
        int newl = 0;
        for(int i = 0; i < A.length; i++) {
            if (newl == 0 || A[i] != A[i-1]) { //encounter a new element
                A[newl++] = A[i];
            }
        }
        return newl;
    }
}
