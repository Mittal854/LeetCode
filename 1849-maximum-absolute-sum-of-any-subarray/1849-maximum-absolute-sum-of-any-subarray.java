class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int maxS=Integer.MIN_VALUE;;
        int currS=0;
        for(int num:nums)
        {
            currS+=num;
            if(currS<0) currS=0;
            maxS=Math.max(maxS,currS);
        }
        currS=0;
        int minS=Integer.MAX_VALUE;
        for(int num:nums)
        {
            currS+=num;
            if(currS>0) currS=0;
            minS=Math.min(minS,currS);
        }
        return Math.max(Math.abs(maxS),Math.abs(minS));
    }
}