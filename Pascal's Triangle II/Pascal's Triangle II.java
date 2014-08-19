public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<Integer>();
        int[] A=new int[rowIndex+1];
        A[0]=1;
        for(int i=1;i<=rowIndex;i++){
            for(int j=i;j>=1;j--) A[j]+=A[j-1];
        }
        for(int i=0;i<A.length;i++){
            res.add(A[i]);
        }
        return res;
    }
}
