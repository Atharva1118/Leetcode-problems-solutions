class Solution(object):
    def isValidSudoku(self, board):
        rows=[[0]*9 for _ in range(9)]
        cols=[[0]*9 for _ in range(9)]
        boxs=[[0]*9 for _ in range(9)]
        for r in range(9):
            for c in range(9):
                if board[r][c]=='.':
                    continue
                val=ord(board[r][c])-ord('1')
                if rows[r][val]==1:
                    return False
                rows[r][val]=1
                if cols[c][val]==1:
                    return False
                cols[c][val]=1
                boxIdx=3*(r//3)+(c//3)
                if boxs[boxIdx][val]==1:
                    return False
                boxs[boxIdx][val]=1
        return True

#Time Complexity: O(1)
#Space Complexity:O(1)
