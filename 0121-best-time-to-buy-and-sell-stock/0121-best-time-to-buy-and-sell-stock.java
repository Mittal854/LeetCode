class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int currMini=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            int profit=prices[i]-currMini;
            maxProfit=Math.max(maxProfit,profit);
            currMini=Math.min(currMini,prices[i]);
        }
        return maxProfit;

    }
}