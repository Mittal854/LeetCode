class Solution {
    public int jump(int[] nums) {
        int count=0;
        int l=0;
        int r=0;
        int n=nums.length;
        while(r<n-1)
        {
            int far=0;
            for(int i=l;i<=r;i++)
            {
                far=Math.max(far,i+nums[i]);
            }
            l=r+1;
            r=far;
            count++;
        }
        return count;
    }
}