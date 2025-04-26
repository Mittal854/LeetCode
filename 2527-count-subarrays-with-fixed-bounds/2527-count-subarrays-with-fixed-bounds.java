class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n=nums.length;
        int lastInvalid=-1;
        int minIndex=-1;
        int maxIndex=-1;
        long count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>maxK || nums[i]<minK) lastInvalid=i;
            if(nums[i]==minK) minIndex=i;
            if(nums[i]==maxK) maxIndex=i;
            int valid=Math.min(minIndex,maxIndex);
            if(valid>lastInvalid)
            {
                count+=valid-lastInvalid;
            }
        }
        return count;
    }
}