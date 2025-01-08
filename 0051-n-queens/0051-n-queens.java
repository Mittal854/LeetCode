class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] row:board)
        {
            Arrays.fill(row,'.');
        }
        solve(0,n,board,ans);
        return ans;
    }
    public void solve(int col,int n,char[][] board,List<List<String>>ans)
    {
        if(col==n)
        {
            List<String> one=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                String row="";
                for(int j=0;j<n;j++)
                {
                    row=row+board[i][j];
                }
                one.add(new String(row));
            }
            ans.add(new ArrayList<>(one));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(isValid(i,col,board))
            {
                board[i][col]='Q';
                solve(col+1,n,board,ans);
                board[i][col]='.';
            }
        }

    }
    public boolean isValid(int row,int col,char[][] board)
    {
        int n=board.length;
        for(int i=0;i<col;i++)
        {
            if(board[row][i]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i<n && j>=0;i++,j--)
        {
            if(board[i][j]=='Q') return false;
        }

        return true;
    }
}