class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],i);
        }
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int needed=arr[j]-arr[i];
                if(needed<arr[i] && map.containsKey(needed))
                {
                    int k=map.get(needed);
                    dp[i][j]=dp[k][i]+1;
                    max=Math.max(max,dp[i][j]);
                }
                else
                {
                    dp[i][j]=2;
                }
            }
        }
        return max>=3?max:0;
    }
}