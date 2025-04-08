class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        if(map.size()==n) return 0;
        int ans=0;
        for(int i=0;i<n;i=i+3)
        {
            map.put(nums[i],map.get(nums[i])-1);
            if(map.get(nums[i])==0) map.remove(nums[i]);
            if(i+1<n)
            {
                map.put(nums[i+1],map.get(nums[i+1])-1);
                if(map.get(nums[i+1])==0) map.remove(nums[i+1]);
            }
            if(i+2<n)
            {
                map.put(nums[i+2],map.get(nums[i+2])-1);
                if(map.get(nums[i+2])==0) map.remove(nums[i+2]);
            }
            ans++;
            if(map.size()==n-i-3) return ans;
        }
        return ans;
    }
}