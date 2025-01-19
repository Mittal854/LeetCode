class Pair{
    int height;
    int row;
    int col;
    Pair(int height,int row,int col)
    {
        this.height=height;
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m=heightMap.length;
        int n=heightMap[0].length;
        if(m<3 ||n<3) return 0;
        boolean[][] visited=new boolean[m][n];
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(a.height,b.height));
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==m-1||j==n-1)
                {
                    pq.add(new Pair(heightMap[i][j],i,j));
                    visited[i][j]=true;
                }
            }
        }
        int ans=0;
        int level=0;
        int[] delR={-1,0,1,0};
        int[] delC={0,-1,0,1};
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            int height=p.height;
            int row=p.row;
            int col=p.col;
            level=Math.max(level,height);
            for(int i=0;i<4;i++)
            {
                int nrow=row+delR[i];
                int ncol=col+delC[i];
                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && !visited[nrow][ncol])
                {
                    pq.add(new Pair(heightMap[nrow][ncol],nrow,ncol));
                    visited[nrow][ncol]=true;
                    if(heightMap[nrow][ncol]<level)
                    {
                        ans+=level-heightMap[nrow][ncol];
                    }
                }
            }
        }
        return ans;


        
    }
}