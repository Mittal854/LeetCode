class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String,Integer>dp=new HashMap<>();
        return helper(0,target,nums,dp);
    }
    public int helper(int index,int target,int[] nums,HashMap<String,Integer>dp)
    {
        if(index==nums.length)
        {
            return target==0?1:0;
        }
        String key=index+","+target;
        if(dp.containsKey(key)) return dp.get(key);

        int add=helper(index+1,target-nums[index],nums,dp);
        int sub=helper(index+1,target+nums[index],nums,dp);
        dp.put(key,add+sub);
        return add+sub;
    }
}