class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int curr=0;
        for(int i:nums)
        {
            curr+=i;
            int rem=curr-goal;
            if(map.containsKey(rem)) result+=map.get(rem);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return result;
    }
}