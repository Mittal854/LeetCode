class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int maxSum=Integer.MIN_VALUE;
        int curr=0;
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            while(set.contains(nums[i]))
            {
                curr-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[i]);
            curr+=nums[i];
            maxSum=Math.max(curr,maxSum);
        }
        return maxSum;
    }
}