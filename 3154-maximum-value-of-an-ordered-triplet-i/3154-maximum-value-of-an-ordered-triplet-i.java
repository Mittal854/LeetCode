class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxDiff=Long.MIN_VALUE;
        long ans=0;
        int maxPrefix=nums[0];
        for(int i=1;i<n-1;i++)
        {
            maxDiff=Math.max(maxDiff,maxPrefix-nums[i]);
            ans=Math.max(ans,maxDiff*(long)nums[i+1]);
            maxPrefix=Math.max(maxPrefix,nums[i]);
        }
        return Math.max(ans,0);


        
    }
}