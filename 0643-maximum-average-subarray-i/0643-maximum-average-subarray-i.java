class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average=0.0;
        int n=nums.length;
        double sum=0.0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        average=sum;
        
        for(int i=k;i<n;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            average=Math.max(average,sum);
        }
        return (double)average/k;
    }
}