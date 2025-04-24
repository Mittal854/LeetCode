class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int k=set.size();
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[] nums, int k)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        int res=0;
        while(right<nums.length)
        {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k)
            {
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;
            }
            res+=right-left+1;
            right++;
        }
        return res;
    }
}