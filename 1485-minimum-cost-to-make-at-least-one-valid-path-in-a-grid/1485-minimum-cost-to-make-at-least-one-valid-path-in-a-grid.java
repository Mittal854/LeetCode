class Pairs{
    int cost;
    int row;
    int col;
    Pairs(int cost,int row,int col)
    {
        this.row=row;
        this.col=col;
        this.cost=cost;
    }
}
class Solution {

    public boolean isValid(int r,int c,int m,int n)
    {
        return(r>=0 &&r<m &&c>=0 &&c<n);
    }

    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        PriorityQueue<Pairs>heap=new PriorityQueue<>((a,b)->Integer.compare(a.cost,b.cost));
        int[] delR={0,0,1,-1};
        int[] delC={1,-1,0,0};
        heap.add(new Pairs(0,0,0));
        while(!heap.isEmpty())
        {
            Pairs a=heap.poll();
            int cost=a.cost;
            int row=a.row;
            int col=a.col;
            if(vis[row][col]) continue;
            if(row==m-1 && col==n-1 ) return cost;
            vis[row][col]=true;
            for(int i=0;i<4;i++)
            {
                int nrow=row+delR[i];
                int ncol=col+delC[i];
                if(isValid(nrow,ncol,m,n) &&!vis[nrow][ncol])
                {
                    int newC=cost;
                    newC+=(i+1)==grid[row][col]?0:1;
                    heap.add(new Pairs(newC,nrow,ncol));
                }

            }
        }
        return 0;

    }
}