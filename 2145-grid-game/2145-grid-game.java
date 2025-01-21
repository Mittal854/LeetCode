class Solution {
    public long gridGame(int[][] grid) {
        int n=grid[0].length;
        if(n<2) return 0;
        long topSum=0;
        for(int i=0;i<n;i++)
        {
            topSum+=grid[0][i];
        }
        long botSum=0;
        long sum=Long.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            topSum-=grid[0][i];
            sum=Math.min(sum,Math.max(topSum,botSum));
            botSum+=grid[1][i];
        }
        return sum;
    }
}