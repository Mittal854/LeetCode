class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        for(int num:nums)
        {
            if(num<k) return -1;
        }
        Arrays.sort(nums);
        int max=nums[n-1];
        int operations=0;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]==max) continue;
            else
            {
                operations++;
                max=nums[i];
            }
            if(max==k) break;
        }
        if(nums[0]>k) operations++;
        return operations;

    }
}