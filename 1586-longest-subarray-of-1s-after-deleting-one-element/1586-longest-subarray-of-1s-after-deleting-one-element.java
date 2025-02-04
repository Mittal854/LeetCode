class Solution {
    public int longestSubarray(int[] nums) {
        int zeros=0;
        int maxL=0;
        int n=nums.length;
        int left=0;
        int right=0;
        while(right<n)
        {
            if(nums[right]==0) zeros++;
            while(zeros>1)
            {
                if(nums[left]==0) zeros--;
                left++;
            }
            maxL=Math.max(maxL,right-left+1);
            right++;
        }
        return maxL-1;
    }
}