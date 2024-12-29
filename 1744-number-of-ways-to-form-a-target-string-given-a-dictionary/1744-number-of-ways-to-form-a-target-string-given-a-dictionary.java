class Solution {
    public int numWays(String[] words, String target) {
        int mod=1_000_000_007;
        int n=target.length();
        int m=words[0].length();
        int[][] freq=new int[26][m];
        for(String word:words)
        {
            for(int i=0;i<m;i++)
            {
                freq[word.charAt(i)-'a'][i]++;
            }
        }
        long[][] dp=new long[n+1][m+1];
        dp[0][0]=1;
        for(int i=1;i<=m;i++)
        {
            dp[0][i]=1;
            for(int j=1;j<=n;j++)
            {
                dp[j][i]=dp[j][i-1];
                char targetC=target.charAt(j-1);
                if(freq[targetC-'a'][i-1]>0)
                {
                    dp[j][i]+=dp[j-1][i-1]*freq[targetC-'a'][i-1];
                    dp[j][i]%=mod;
                }
            }
        }
        return (int)dp[n][m];
    }
}