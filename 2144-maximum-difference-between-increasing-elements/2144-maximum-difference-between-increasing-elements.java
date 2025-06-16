class Solution {
    public int maximumDifference(int[] nums) {
        int prevMin=nums[0];
        int maxD=-1;
        for(int i=1;i<nums.length;i++)
        {
            int diff=nums[i]-prevMin;
            maxD=Math.max(maxD,diff);
            prevMin=Math.min(prevMin,nums[i]);
        }
        return maxD>0?maxD:-1;
    }
}