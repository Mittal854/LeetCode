class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        String[] Snums=new String[n];
        for(int i=0;i<n;i++)
        {
            Snums[i]=Integer.toString(nums[i]);
        }
        int count=0;
        for(String num:Snums)
        {
            if(num.length()%2==0) count++;
        }
        return count;
    }
}