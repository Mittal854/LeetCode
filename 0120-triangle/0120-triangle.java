class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[n][n];
        dp[0][0]=triangle.get(0).get(0);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int value=triangle.get(i).get(j);
                if(j==0)
                {
                    dp[i][j]=dp[i-1][j]+value;
                }
                else if(j==i)
                {
                    dp[i][j]=dp[i-1][j-1]+value;
                }
                else
                {
                    dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j])+value;
                }
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