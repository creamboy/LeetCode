public class Solution {
    public int maxSubArray(int[] A) {
        if(A.length==0) return 0;
        return helper(A, 0, A.length-1);
    }
    
    int helper(int[] A, int left, int right){
        if(right==left) return A[left];
        int mid=(left+right)/2;
        int leftans=helper(A, left, mid);
        int rightans=helper(A, mid+1, right);
        int leftmax=A[mid];
        int rightmax=A[mid+1];
        int temp=0;
        for(int i=mid;i>=left;i--){
            temp+=A[i];
            if(temp>leftmax) leftmax=temp;
        }
        temp=0;
        for(int i=mid+1;i<=right;i++){
            temp+=A[i];
            if(temp>rightmax) rightmax=temp;
        }
        return Math.max(Math.max(leftans, rightans), leftmax+rightmax);
    }
}
