class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n=nums.length;
        int oneIndex=-1;
        int nIndex=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                oneIndex=i;
            }
            if(nums[i]==n)
            {
                nIndex=i;
            }
        }
        int res=oneIndex+(n-1-nIndex);
        if(oneIndex>nIndex) res-=1;
        return res;
    }
}