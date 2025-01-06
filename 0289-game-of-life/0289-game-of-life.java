class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] b=new int[n][m];
        int[] delR={0,1,0,-1,-1,-1,+1,+1};
        int[] delC={1,0,-1,0,-1,+1,-1,+1};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int live=0;
                int dead=0;
                for(int k=0;k<8;k++)
                {
                    int nr=i+delR[k];
                    int nc=j+delC[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m)
                    {
                        if(board[nr][nc]==0) dead++;
                        else live++;
                    }
                }
                int val=board[i][j];
                if(val==0)
                {
                    if(live==3) b[i][j]=1;
                    else b[i][j]=0;
                }
                else
                {
                    if(live<2 || live>3)
                    {
                        b[i][j]=0;
                    }
                    else
                    {
                        b[i][j]=1;
                    }
                    
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                board[i][j]=b[i][j];
            }
        }
    }
}