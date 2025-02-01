class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=0;
        int diff=Integer.MAX_VALUE;
        for(int num:nums)
        {
            if(Math.abs(num-0)<diff)
            {
                ans=num;
                diff=Math.abs(num-0);
            }
            else if(Math.abs(num)==diff)
            {
                ans=Math.max(ans,num);
            }
        }
        return ans;
    }
}