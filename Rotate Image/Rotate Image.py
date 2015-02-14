class Solution:
    # @param matrix, a list of lists of integers
    # @return a list of lists of integers
    def rotate(self, matrix):
        if len(matrix)==0 or len(matrix)==1:
            return matrix
        n=len(matrix)-1
        for i in range(len(matrix)):
            for j in range(n-i):
                temp=matrix[i][j]
                matrix[i][j]=matrix[n-j][n-i]
                matrix[n-j][n-i]=temp
        
        for i in range(len(matrix)/2):
            for j in range(len(matrix[0])):
                temp=matrix[i][j]
                matrix[i][j]=matrix[n-i][j]
                matrix[n-i][j]=temp
        return matrix
