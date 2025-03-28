class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    public boolean helper(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char k='1';k<='9';k++)
                    {
                        if(isValid(i,j,board,k))
                        {
                            board[i][j]=k;
                            if(helper(board)) return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(int row,int col,char[][]board,char k)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==k) return false;
            if(board[i][col]==k) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==k) return false;
        }
        return true;

    }
}