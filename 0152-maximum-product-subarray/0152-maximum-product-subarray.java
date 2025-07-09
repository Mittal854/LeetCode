class Solution {
    public int maxProduct(int[] nums) {
        int maxP=Integer.MIN_VALUE;
        int curr=1;
        for(int i:nums)
        {
            curr*=i;
            maxP=Math.max(curr,maxP);
            if(curr==0) curr=1;
        }
        curr=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            curr*=nums[i];
            maxP=Math.max(curr,maxP);
            if(curr==0) curr=1;

        }
        return maxP;
    }
}