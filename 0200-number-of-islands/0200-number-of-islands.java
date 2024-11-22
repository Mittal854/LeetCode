class Pair{
    int row;
    int col;
    Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}

class Solution {
    
    private void bfs(int row,int col,boolean[][] visit,char[][] grid)
    {
        visit[row][col]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;
        int[] delrow={-1,0,1,0};
        int[] delcol={0,-1,0,1};
        while(!q.isEmpty())
        {
            Pair a=q.poll();
            int row1=a.row;
            int col1=a.col;
            for(int i=0;i<=3;i++)
            {
                
                    int nrow=row1+delrow[i];
                    int ncol=col1+delcol[i];
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && !visit[nrow][ncol])
                    {
                        visit[nrow][ncol]=true;
                        q.add(new Pair(nrow,ncol));
                    }
                
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visit=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && !visit[i][j])
                {
                    bfs(i,j,visit,grid);
                    count++;
                }
            }
        }
        return count;
    }
}