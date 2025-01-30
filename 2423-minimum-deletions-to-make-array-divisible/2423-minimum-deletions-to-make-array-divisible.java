class Solution {

    public int hcf(int a,int b)
    {
        if(b==0) return a;
        return hcf(b,a%b);
    }

    public int hcfArray(int[]numsDivide)
    {
        int hcf=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++)
        {
            hcf=hcf(hcf,numsDivide[i]);
        }
        return hcf;
    }

    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int hcf=hcfArray(numsDivide);
        for(int i=0;i<nums.length;i++)
        {
            if(hcf%nums[i]==0) return i;
        }
        return -1;
    }
}