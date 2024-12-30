class Solution {
    public boolean canJump(int[] nums) {
        int maxI=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxI) return false;
            maxI=Math.max(maxI,i+nums[i]);
            if(maxI>=nums.length-1) return true;
        }
        return true;
    }
}