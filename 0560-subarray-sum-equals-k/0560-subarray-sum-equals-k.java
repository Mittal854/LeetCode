class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int[]prefixS=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            prefixS[i]=prefixS[i-1]+nums[i-1];
        }
        int total=0;
        for(int right=1;right<=n;right++)
        {
            for(int left=0;left<right;left++)
            {
                if(prefixS[right]-prefixS[left]==k) total++;

            }
        }
        return total;
    }
}