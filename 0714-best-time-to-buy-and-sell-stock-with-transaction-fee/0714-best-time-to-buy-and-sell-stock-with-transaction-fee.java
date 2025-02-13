class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sell=0;
        int hold=Integer.MIN_VALUE;
        for(int p:prices)
        {
            sell=Math.max(sell,hold+p);
            hold=Math.max(hold,sell-p-fee);
        }
        return sell;
    }
}