class Solution {

    public void heapify(int i,int n,int[] nums)
    {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && nums[left]>nums[largest])
        {   
            largest=left;
        }
        if(right<n && nums[right]>nums[largest])
        {
            largest=right;
        }
        if(largest!=i)
        {
            int temp=nums[i];
            nums[i]=nums[largest];
            nums[largest]=temp;
            heapify(largest,n,nums);
        }
    }

    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=(n/2);i>=0;i--)
        {
            heapify(i,n,nums);
        }
        for(int i=n-1;i>=0;i--)
        {
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            heapify(0,i,nums);
        }
        return nums;
    }
}