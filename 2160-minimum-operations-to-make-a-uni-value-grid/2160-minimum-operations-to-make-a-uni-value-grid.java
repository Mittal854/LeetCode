class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        int[]flatten=new int[m*n];
        int val=grid[0][0]%x;
        int i=0;
        for(int j=0;j<m;j++)
        {
            for(int k=0;k<n;k++)
            {
                flatten[i++]=grid[j][k];
                if(grid[j][k]%x!=val) return -1;
            }
        }
        Arrays.sort(flatten);
        int median=i/2;
        int steps=0;
        for(int j=0;j<i;j++)
        {
            steps+=(Math.abs(flatten[j]-flatten[median]))/x;
        }
        return steps;
    }
}