public class Solution {
    public int reverse(int x) {
        boolean neg=false;
        if (x < 0) {neg = true; x = -x;}
        int ret = 0;
        while (x/10!=0){
            ret = ret*10+ x%10;
            x = x / 10;
        }
        ret =ret*10+x;
        if (ret>0x7fffffff) return 0; //overflow check.
        if (neg) return -(int)ret;
        return (int)ret;
    }
}