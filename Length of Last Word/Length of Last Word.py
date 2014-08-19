class Solution:
    # @param s, a string
    # @return an integer
    def lengthOfLastWord(self, s):
        last=0
        i=len(s)-1
        while i>=0 and s[i]==' ':
            i-=1
        while i>=0 and s[i]!=' ':
            i-=1
            last+=1
        return last
