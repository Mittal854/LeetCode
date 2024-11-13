class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time)
    {
        this.row=row;
        this.col=col;
        this.time=time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        int[][] vis=new int[m][n];
        int cntFresh=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
                else
                {
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) cntFresh++;
            }
        }
        int tm=0;
        int[] delRow={0,+1,0,-1};
        int[] delCol={+1,0,-1,0};
        int cnt=0;
        while(!q.isEmpty())
        {
            Pair a=q.poll();
            int row=a.row;
            int col=a.col;
            int time=a.time;
            tm=Math.max(tm,time);
            for(int i=0;i<4;i++)
            {
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
                {
                    q.add(new Pair(nrow,ncol,time+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
            
        }
        if(cnt!=cntFresh) return -1;
            return tm;
    }
}