class Solution {
    public long putMarbles(int[] weights, int k) {
        if(k==1) return 0;
        int n=weights.length;
        long[] sums=new long[n-1];
        for(int i=0;i<n-1;i++)
        {
            sums[i]=weights[i]+weights[i+1];
        }
        Arrays.sort(sums);
        long minScore=0;
        long maxScore=0;
        for(int i=0;i<k-1;i++)
        {
            minScore+=sums[i];
            maxScore+=sums[n-2-i];
        }
        return maxScore-minScore;
    }
}