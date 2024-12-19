class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++) dp[0][i]=matrix[0][i];
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum1=j-1>=0?matrix[i][j]+dp[i-1][j-1]:Integer.MAX_VALUE;
                int sum2=matrix[i][j]+dp[i-1][j];
                int sum3=j+1<n?matrix[i][j]+dp[i-1][j+1]:Integer.MAX_VALUE;
                dp[i][j]=Math.min(sum1,Math.min(sum2,sum3));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(dp[n-1][i]<ans) ans=dp[n-1][i];
        }
        return ans;
    }
}