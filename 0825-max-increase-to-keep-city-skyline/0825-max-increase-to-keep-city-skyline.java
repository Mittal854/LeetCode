class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] rows=new int[n];
        int[] cols=new int[n];
        for(int i=0;i<n;i++)
        {
            int maxR=0;
            int maxC=0;
            for(int j=0;j<n;j++)
            {
                maxR=Math.max(grid[i][j],maxR);
                maxC=Math.max(grid[j][i],maxC);
            }
            rows[i]=maxR;
            cols[i]=maxC;
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                count+=Math.min(rows[i],cols[j])-grid[i][j];
            }
        }
        return count;
    }
}