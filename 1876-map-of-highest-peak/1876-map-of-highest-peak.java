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
    public int[][] highestPeak(int[][] isWater) {
        int m=isWater.length;
        int n=isWater[0].length;
        int ans[][]=new int[m][n];
        boolean[][] visited=new boolean[m][n];
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isWater[i][j]==1)
                {
                    visited[i][j]=true;
                    ans[i][j]=0;
                    q.add(new Pair(i,j));
                }
            }
        }
        int[] delR={-1,0,1,0};
        int[] delC={0,1,0,-1};
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int row=p.row;
            int col=p.col;
            for(int i=0;i<4;i++)
            {
                int nrow=row+delR[i];
                int ncol=col+delC[i];
                if(nrow>=0 && nrow<m &&ncol>=0 && ncol<n &&!visited[nrow][ncol])
                {
                    visited[nrow][ncol]=true;
                    ans[nrow][ncol]=ans[row][col]+1;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
        return ans;
    }
}