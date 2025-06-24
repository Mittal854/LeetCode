class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
            ans=Math.min(nums[low],ans);
            low=mid+1;}
            else{
                ans=Math.min(nums[mid],ans);
                high=mid-1;
            }
        }
        return ans;
    }
}