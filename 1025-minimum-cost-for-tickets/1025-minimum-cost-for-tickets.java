class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n=days[days.length-1];
        boolean[] travel=new boolean[n+1];
        for(int i:days)
        {
            travel[i]=true;
        }
        int[]dp=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            if(!travel[i]){ 
                dp[i]=dp[i-1];
                continue;}
            dp[i]=dp[i-1]+costs[0];
            dp[i]=Math.min(dp[i],dp[Math.max(0,i-7)]+costs[1]);
            dp[i]=Math.min(dp[i],dp[Math.max(0,i-30)]+costs[2]);

        }
        return dp[n];
    }
}