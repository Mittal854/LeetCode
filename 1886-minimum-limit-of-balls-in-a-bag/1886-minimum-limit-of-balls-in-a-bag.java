class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low=1;
        int high=0;
        for(int i:nums)
        {
            high=Math.max(i,high);
        }
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(check(nums,maxOperations,mid))
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    public boolean check(int[] nums,int maxO,int penalty)
    {
        int operations=0;
        for(int i:nums)
        {
            if(i>penalty)
            {
                operations+=(i-1)/penalty;
            }
            if(operations>maxO) return false;
        }
        return true;
    }
}