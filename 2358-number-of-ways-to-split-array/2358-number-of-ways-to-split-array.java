class Solution {
    public int waysToSplitArray(int[] nums) {
        long total=0;
        for(int i:nums)
        {
            total+=i;
        }
        int count=0;
        long sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum+=nums[i];
            total-=nums[i];
            if(sum>=total) count++;
        }
        return count;
    }
}