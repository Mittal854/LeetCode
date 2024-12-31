class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        for(int i:cardPoints) total+=i;
        if(cardPoints.length==k) return total;
        int n=cardPoints.length;
        int sum=0;
        for(int i=0;i<n-k;i++)
        {
            sum+=cardPoints[i];
        }
        int ans=0;
        ans=Math.max(ans,total-sum);
        for(int i=n-k;i<n;i++)
        {
            sum=sum+cardPoints[i]-cardPoints[i-n+k];
            ans=Math.max(ans,total-sum);
        }
        return ans;
    }
}