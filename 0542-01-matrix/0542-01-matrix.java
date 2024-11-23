class Pair{
    int row;
    int col;
    int dis;
    Pair(int row,int col,int dis)
    {
        this.row=row;
        this.col=col;
        this.dis=dis;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] ans=new int[m][n];
        boolean[][] visit=new boolean[m][n];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    visit[i][j]=true;
                    q.add(new Pair(i,j,0));
                }
            }
        }
        int[] delRow={-1,0,1,0};
        int[] delCol={0,-1,0,1};
        while(!q.isEmpty())
        {
            Pair a=q.poll();
            int row=a.row;
            int col=a.col;
            int dis=a.dis;
            ans[row][col]=dis;
            for(int i=0;i<4;i++)
            {
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];
                if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&!visit[nrow][ncol])
                {
                    visit[nrow][ncol]=true;
                    q.add(new Pair(nrow,ncol,dis+1));
                }
            }
            
        }
        return ans;
    }
}