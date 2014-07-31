class Solution:
    # @return a list of integers
    def grayCode(self, n):
        list=[0]
        for i in range(n):
            m=1<<i
            for j in range(len(list)-1, -1, -1):
                list.append(list[j]+m)
        return list
