class Solution:
    # @param num, a list of integer
    # @return a list of lists of integer
    def subsetsWithDup(self, S):
        S.sort()
        res = [[]]
        pre, count = None, 0
        for e in S:
            if e != pre:
                pre,count = e,len(res)
            res = res + [l+[e] for l in res[len(res)-count:]]
        return res
