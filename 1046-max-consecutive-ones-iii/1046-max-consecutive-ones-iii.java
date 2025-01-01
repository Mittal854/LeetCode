class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int maxl=0;
        int zeros=0;
        while(r<n)
        {
            if(nums[r]==0) zeros++;
            while(zeros>k)
            {
                if(nums[l]==0) zeros--;
                l=l+1;
            }
            maxl=Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
}