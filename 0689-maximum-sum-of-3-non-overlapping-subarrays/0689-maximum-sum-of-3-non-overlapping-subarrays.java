class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n=nums.length;
        int[] sums=new int[n+1];
        for(int i=0;i<n;i++)
        {
            sums[i+1]=sums[i]+nums[i];
        }
        int[] left=new int[n];
        int[] right=new int[n];
        int maxSum=sums[k]-sums[0];
        left[k-1]=0;
        for(int i=k;i<n;i++)
        {
            if(sums[i+1]-sums[i+1-k]>maxSum)
            {
                maxSum=sums[i+1]-sums[i+1-k];
                left[i]=i+1-k;
            }
            else
            {
                left[i]=left[i-1];
            }
        }
        maxSum=sums[n]-sums[n-k];
        right[n-k]=n-k;
        for(int i=n-k-1;i>=0;i--)
        {
            if(sums[i+k]-sums[i]>=maxSum)
            {
                maxSum=sums[i+k]-sums[i];
                right[i]=i;
            }
            else
            {
                right[i]=right[i+1];
            }
        }
        int[] result=new int[3];
        maxSum=0;
        for(int i=k;i<=n-2*k;i++)
        {
            int l=left[i-1];
            int r=right[i+k];
            int total=sums[i+k]-sums[i]+sums[l+k]-sums[l]+sums[r+k]-sums[r];
            if(total>maxSum)
            {
                maxSum=total;
                result[0]=l;
                result[1]=i;
                result[2]=r;
            }
        }
        return result;

    }
}