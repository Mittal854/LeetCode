class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average=0.0;
        int n=nums.length;
        double sum=0.0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        average=(double)sum/k;
        sum=average;
        for(int i=k;i<n;i++)
        {
            sum=sum*k+nums[i]-nums[i-k];
            sum=(double)sum/k;
            average=Math.max(average,sum);
        }
        return average;
    }
}