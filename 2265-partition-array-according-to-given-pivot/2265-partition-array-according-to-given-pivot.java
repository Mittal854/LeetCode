class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[]ans=new int[n];
        int m=0;
        for(int num:nums)
        {
            if(num<pivot) 
            {
                ans[m]=num;
                m++;
            }
        }
        for(int num:nums)
        {
            if(num==pivot)
            {
                ans[m]=num;
                m++;
            }
        }
        for(int num:nums)
        {
            if(num>pivot)
            {
                ans[m]=num;
                m++;
            }
        }
        return ans;
    }
}