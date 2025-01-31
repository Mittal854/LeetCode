class Solution {

    private int[] del={-1,0,1,0,-1};

    public boolean isValid(int n,int x,int y)
    {
        if(x>=0 && x<n && y>=0 && y<n) return true;
        return false;
    }
    public int island(int row,int col,int island_number,int[][] grid,int n)
    {
        grid[row][col]=island_number;
        int count=1;
        for(int i=0;i<4;i++)
        {
            int nrow=row+del[i];
            int ncol=col+del[i+1];
            if(isValid(n,nrow,ncol) && grid[nrow][ncol]==1)
            {
                count+=island(nrow,ncol,island_number,grid,n);
            }
        }
        return count;

    }

    public int largestIsland(int[][] grid) {
        int n=grid.length;
        int island_number=2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    int count=island(i,j,island_number,grid,n);
                    map.put(island_number,count);
                    island_number++;
                }
            }
        }

        int maxsize=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    HashSet<Integer>set=new HashSet<>();
                    for(int k=0;k<4;k++)
                    {
                        int nrow=i+del[k];
                        int ncol=j+del[k+1];
                        if(isValid(n,nrow,ncol) && grid[nrow][ncol]>1)
                        {
                            set.add(grid[nrow][ncol]);
                        }
                    }
                    int size=1;
                    for(int id:set)
                    {
                        size+=map.get(id);
                    }
                    maxsize=Math.max(maxsize,size);
                }
            }
        }
        return maxsize==0?n*n:maxsize;

    }
}