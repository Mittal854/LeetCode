class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=0)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        int neg=high+1;
        low=0;
        high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<=0)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        int pos=n-low;
        return Math.max(neg,pos);
    }
}