class Solution {
    public long continuousSubarrays(int[] nums) {
        int n=nums.length;
        int left=0;
        long count=0;
        long w=0;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        int right=0;
        for(right=0;right<n;right++)
        {
            maxi=Math.max(maxi,nums[right]);
            mini=Math.min(mini,nums[right]);
            if(maxi-mini>2)
            {
                w=right-left;
                count+=w*(w+1)/2;
                left=right;
                maxi=nums[right];
                mini=nums[right];
                while(Math.abs(nums[right]-nums[left-1])<=2)
                {
                    left--;
                    maxi=Math.max(maxi,nums[left]);
                    mini=Math.min(mini,nums[left]);
                }
                if(left<right)
                {
                    w=right-left;
                    count-=w*(w+1)/2;
                }
            }
        }
        w=right-left;
        count+=w*(w+1)/2;
        return count;
    }
}