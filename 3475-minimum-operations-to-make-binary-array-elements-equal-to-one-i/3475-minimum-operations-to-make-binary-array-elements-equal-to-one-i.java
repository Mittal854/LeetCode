class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            if(nums[i]==1) continue;
            nums[i]=1;
            nums[i+1]=nums[i+1]==1?0:1;
            nums[i+2]=nums[i+2]==1?0:1;
            count++;
        }
        if(nums[n-2]==0 || nums[n-1]==0) return -1;
        return count;
    }
}