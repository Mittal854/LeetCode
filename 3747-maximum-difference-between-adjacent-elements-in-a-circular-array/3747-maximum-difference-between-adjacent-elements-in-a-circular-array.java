class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            int diff=Math.abs(nums[i]-nums[i-1]);
            ans=Math.max(ans,diff);
        }
        int diff=Math.abs(nums[0]-nums[n-1]);
        ans=Math.max(ans,diff);
        return ans;

    }
}