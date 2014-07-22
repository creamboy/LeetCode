class Solution:
    # @return an integer
    def reverse(self, x):
        neg=False
        if x<0:
            neg=True
            x=-x
        rev=0
        while x/10:
            rev=rev*10+x%10;
            x=x/10
        rev=rev*10+x
        if rev>0x7fffffff:
            return 0
        if neg:
            return -rev
        return rev
