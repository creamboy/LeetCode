class Solution:
    # @return a list of lists of integers
    def generate(self, numRows):
        list=[]
        if numRows==0:
            return list
        list.append([1])
        for i in range(1, numRows):
            last=list[len(list)-1]
            value=[]
            for k in range(i+1):
                if k==0 or k==i:
                    value.append(1)
                else:
                    value.append(last[k-1]+last[k])
            list.append(value)
        return list
                    
                    
