class Solution:
    # @param matrix, a list of lists of integers
    # @param target, an integer
    # @return a boolean
    def searchMatrix(self, matrix, target):
        m=0
        while target>matrix[m][0]and m!=len(matrix)-1:
            m+=1
        if target<matrix[m][0] and m!=0:
            m-=1
        for i in range(len(matrix[m])):
            if target==matrix[m][i]:
                return True
        return False
