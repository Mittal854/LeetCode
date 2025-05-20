class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] diff=new int[n+1];
        for(int i=0;i<queries.length;i++)
            {
                int in1=queries[i][0];
                int in2=queries[i][1];
                diff[in1]++;
                if(in2+1<n){
                    diff[in2+1]--;
                }
            }
        int delta=0;
        for(int i=0;i<n;i++)
            {
                delta+=diff[i];
                if(nums[i]>delta)
                {
                    return false;
                }
            }
        return true;
        
    }
}