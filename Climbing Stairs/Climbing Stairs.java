public class Solution {
    public int climbStairs(int n) {
        if(n<0) return 0;
        int[] s=new int[n+1];
        s[0]=1;
        s[1]=1;
        for(int i=2;i<n+1;i++){
            s[i]=s[i-1]+s[i-2];
        }
        return s[n];
    }
}
