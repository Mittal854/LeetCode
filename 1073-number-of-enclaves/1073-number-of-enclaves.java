class Solution {
    public void dfs(int row,int col,int[][] grid,boolean[][] visit)
    {
        visit[row][col]=true;
        int[] delRow={-1,0,1,0};
        int[] delCol={0,-1,0,1};
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<4;i++)
        {
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<n &&ncol>=0 && ncol<m && grid[nrow][ncol]==1 && !visit[nrow][ncol])
            {
                dfs(nrow,ncol,grid,visit);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visit=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            if(grid[i][0]==1)
            {
                dfs(i,0,grid,visit);
            }
            if(grid[i][m-1]==1)
            {
                dfs(i,m-1,grid,visit);
            }
        }
        for(int j=0;j<m;j++)
        {
            if(grid[0][j]==1)
            {
                dfs(0,j,grid,visit);
            }
            if(grid[n-1][j]==1)
            {
                dfs(n-1,j,grid,visit);
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {

                if(grid[i][j]==1 && !visit[i][j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}