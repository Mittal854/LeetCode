class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;
        int prefixMax=nums[0];
        long maxSum=Long.MIN_VALUE;
        for(int i=1;i<nums.length-1;i++)
        {
            maxSum=Math.max(maxSum,prefixMax-nums[i]);
            ans=Math.max(ans,maxSum*(long)nums[i+1]);
            prefixMax=Math.max(prefixMax,nums[i]);
        }
        return Math.max(ans,0);
    }
}