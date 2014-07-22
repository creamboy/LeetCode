class Solution:
    # @param prices, a list of integer
    # @return an integer
    def maxProfit(self, prices):
        p=0
        for i in range(len(prices)-1):
            temp=prices[i+1]-prices[i]
            if temp>0:
                p=p+temp
        return p
