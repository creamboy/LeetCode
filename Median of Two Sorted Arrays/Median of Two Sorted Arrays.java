public class Solution {
    double findMedianSortedArrays(int A[], int B[]) {
        int C[]=new int[A.length+B.length];
        int j=0,c=0,k=0;
        while(c<A.length &&j <B.length){
            if(A[c]<=B[j]){
                C[k++]=A[c++];
            }else if (B[j]<A[c]){
                C[k++]=B[j++];
            }
        }
        for(int i=j;i<B.length;i++){
            C[k++]=B[i];
        }
        for(int i=c;i<A.length;i++){
            C[k++]=A[i];
        }
        if(C.length%2==0){
            return (C[(C.length/2)]+C[((C.length/2)-1)])/2.0;
        }else{
            return C[(C.length/2)];
        }
    }
 
};