class Solution {
    public int minCapability(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            min=Math.min(num,min);
            max=Math.max(num,max);
        }
        while(min<max)
        {
            int mid=min+(max-min)/2;
            if(rob(nums,k,mid)) max=mid;
            else min=mid+1;
        }
        return max;
    }
    public boolean rob(int[]nums,int k,int max)
    {
        int count=0;
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            if(nums[i]<=max)
            {
                count++;
                i++;
            }
            i++;
        }
        return count>=k;
    }
}