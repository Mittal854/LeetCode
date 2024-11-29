class Solution {
    private void dfs(int row,int col,char[][] board,boolean[][] visit)
    {
        visit[row][col]=true;
        int[] delRow={0,1,0,-1};
        int[] delCol={1,0,-1,0};
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<4;i++)
        {
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol]=='O' && !visit[nrow][ncol] )
            {
                dfs(nrow,ncol,board,visit);
            }
        }
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] visit=new boolean[n][m];
        for(int j=0;j<m;j++)
        {
            if(board[0][j]=='O')
            {
                dfs(0,j,board,visit);
            }
            if(board[n-1][j]=='O')
            {
                dfs(n-1,j,board,visit);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(board[i][0]=='O')
            {
                dfs(i,0,board,visit);
            }
            if(board[i][m-1]=='O')
            {
                dfs(i,m-1,board,visit);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='O' && !visit[i][j])
                {
                    board[i][j]='X';
                }
            }
        }
    }
}