class Solution {

    private int collected;

    public void dfs(int row,int col,int[][]grid,boolean[][] visited)
    {
        visited[row][col]=true;
        int[] delRow={-1,0,1,0};
        int[] delCol={0,-1,0,1};
        collected+=grid[row][col];
        for(int i=0;i<4;i++)
        {
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && !visited[nrow][ncol] && grid[nrow][ncol]>0)
            {
                dfs(nrow,ncol,grid,visited);
            }
        }
    }

    public int findMaxFish(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int maxCollected=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]>0 && !visited[i][j])
                {
                    collected=0;
                    dfs(i,j,grid,visited);
                    maxCollected=Math.max(collected,maxCollected);
                }
            }
        }
        return maxCollected;

    }
}