class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int l=0;
        int h=nums.length-1;
        while(l<=h)
        {
            if(nums[l]!=val) l++;
            else
            {
                int temp=nums[l];
                nums[l]=nums[h];
                nums[h]=temp;
                count++;
                h--;
            }
        }
        return nums.length-count;
    }
}