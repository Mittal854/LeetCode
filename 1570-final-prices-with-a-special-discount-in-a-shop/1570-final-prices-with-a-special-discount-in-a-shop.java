class Solution {
    public int[] finalPrices(int[] prices) {
       int n=prices.length;
       int[] ans=Arrays.copyOf(prices,n);
       for(int i=0;i<n-1;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            if(prices[j]<=prices[i])
            {
                ans[i]=prices[i]-prices[j];
                break;
            }
        }
       }
       ans[n-1]=prices[n-1];
       return ans; 
    }
}