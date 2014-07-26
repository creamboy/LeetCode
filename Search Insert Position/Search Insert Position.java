public class Solution {
    public int searchInsert(int[] A, int target) {
        if(A.length==0) return 0;
        return search(A, 0, A.length-1, target);
    }
    
    int search(int[] A, int start, int end, int target){
        if(end==start){
            if(target>A[start]) return start+1
            return start;
        } else{
            int mid=(start+end)/2;
        if(target==A[mid]) return mid;
        if(target>A[mid]) return search(A, mid, end, target);
        if(target<A[mid]) return search(A, start, mid, target);
        return 0;
        }
        
    }
}
