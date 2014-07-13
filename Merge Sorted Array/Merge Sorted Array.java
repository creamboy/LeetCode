public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        if(m==0){
            for(int i=0;i<n;i++){
                A[i]=B[i];}
        }else if(n==0){
            return;
        }else{
            int[] c=new int[m];
            for(int z=0;z<m;z++){
                c[z]=A[z];
            }
            int i=0;
            int j=0;
            for(int k=0;k<m+n;k++){
                if(i==m){
                    while(j<n){
                        A[k]=B[j];
                        k++;
                        j++;
                    }
                }else if(j==n){
                    while(i<m){
                        A[k]=c[i];
                        k++;
                        i++;
                    }
                }else if(c[i]<=B[j]){
                    A[k]=c[i];
                    i++;
                }else{
                    A[k]=B[j];
                    j++;
                }
            }
        }
    }
}
