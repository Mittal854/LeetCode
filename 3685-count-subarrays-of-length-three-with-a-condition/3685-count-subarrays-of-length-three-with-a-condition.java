class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++)
            {
                int sum=nums[i]+nums[i+2];
                if(sum*2==nums[i+1]) count++;
            }
        return count;
    }
}