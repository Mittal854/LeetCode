class Solution {
    
    public int lB(int[] nums,int t)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==t)
            {
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]>t)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
                
            }
        }
        return ans;
    }
     public int uB(int[] nums,int t)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==t)
            {
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]>t)
            {
                high=mid-1;
                
            }
            else
            {
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[] {-1,-1};
        int lb=lB(nums,target);
        if(lb==-1 || nums[lb]!=target) return new int[] {-1,-1};
        return new int[] {lb,uB(nums,target)};
    }
}