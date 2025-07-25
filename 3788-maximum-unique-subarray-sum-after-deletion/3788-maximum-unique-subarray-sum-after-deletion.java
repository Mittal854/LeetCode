class Solution {
    public int maxSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            max=Math.max(i,max);
        }
        if(max<0) return max;
        HashSet<Integer>set=new HashSet<>();
        int sum=0;
        for(int i:nums)
        {
            if(set.add(i))
            {
                sum+=i>=0?i:0;
            }
        }
        return sum;
    }
}