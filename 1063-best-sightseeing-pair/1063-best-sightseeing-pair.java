class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int m=values[0];
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<values.length;i++)
        {
            ans=Math.max(ans,values[i]-i+m);
            m=Math.max(m,values[i]+i);
        }
        return ans;
    }
}