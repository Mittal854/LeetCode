class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length;
        int[] refunds=new int[n];
        int minCost=0;
        for(int i=0;i<n;i++)
        {
            refunds[i]=costs[i][1]-costs[i][0];
            minCost+=costs[i][0];
        }
        Arrays.sort(refunds);
        for(int i=0;i<n/2;i++)
        {
            minCost+=refunds[i];
        }
        return minCost;
    }
}