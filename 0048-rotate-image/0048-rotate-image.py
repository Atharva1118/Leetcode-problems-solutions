class Solution(object):
    def rotate(self, matrix):
        for i in range(len(matrix)):
            for j in range(i+1,len(matrix)):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        for i in range(len(matrix)):
            j=len(matrix[i])-1
            k=0
            while(k<j):
                matrix[i][k],matrix[i][j]=matrix[i][j],matrix[i][k]
                k=k+1
                j=j-1
