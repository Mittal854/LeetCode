class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int total=0;
        for(int i:nums)
        {
            sum+=i;
            if(sum==k) total++;
            if(map.containsKey(sum-k)) total+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return total;
    }
}