class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int maxS=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                sum+=nums[i];
            }
            else
            {
                sum=nums[i];
            }
            maxS=Math.max(sum,maxS);
        }
        return maxS;

    }
}