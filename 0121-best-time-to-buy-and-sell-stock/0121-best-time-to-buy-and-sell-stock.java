class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int profit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            profit=prices[i]-min;
            maxProfit=Math.max(profit,maxProfit);
            min=Math.min(min,prices[i]);
        }
        return maxProfit>0?maxProfit:0;
    }
}