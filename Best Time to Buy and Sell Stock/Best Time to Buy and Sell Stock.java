public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int p=0;
        int tempbuy=prices[0];
        for(int i=0; i<prices.length;i++){
            tempbuy=Math.min(tempbuy, prices[i]);
            p=Math.max(p, prices[i]-tempbuy);
        }
        return p;
    }
}