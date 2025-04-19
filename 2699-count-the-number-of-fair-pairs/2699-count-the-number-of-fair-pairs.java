class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int l=lowerI(nums,i+1,n-1,lower-nums[i]);
            int r=higherI(nums,i+1,n-1,upper-nums[i]);
            if(l<=r) ans+=r-l+1;
        }
        return ans;

    }
    public int lowerI(int[]nums,int start,int end,int t)
    {
        int low=start;
        int high=end;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<t)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
    public int higherI(int[]nums,int start,int end,int t)
    {
        int low=start;
        int high=end;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>t)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return high;
    }
}