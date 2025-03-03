class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        ArrayList<Integer>small=new ArrayList<>();
        ArrayList<Integer>large=new ArrayList<>();
        int count=0;
        for(int num:nums)
        {
            if(num<pivot) small.add(num);
            else if(num==pivot) count++;
            else large.add(num);
        }
        int i=0;
        for(int num:small)
        {
            nums[i]=num;
            i++;
        }
        for(int j=0;j<count;j++)
        {
            nums[i]=pivot;
            i++;
        }
        for(int num:large)
        {
            nums[i]=num;
            i++;
        }
        return nums;
    }
}