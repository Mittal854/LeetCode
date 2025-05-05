class Solution {
    public int maxSubArray(int[] nums) {
        int maxS=Integer.MIN_VALUE;
        int currS=0;
        for(int num:nums)
        {
            currS+=num;
            maxS=Math.max(maxS,currS);
            if(currS<0) currS=0;
        }
        return maxS;
    }
}