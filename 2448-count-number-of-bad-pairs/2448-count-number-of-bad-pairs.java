class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Long,Long>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            long key=(long)nums[i]-i;
            map.put(key,map.getOrDefault(key,0L)+1);
        }
        long pairs=0;
        for(var entry:map.entrySet())
        {
            long n=entry.getValue();
            pairs+=(long)n*(n-1)/2;
        }
        long total=(long)nums.length*(nums.length-1)/2;
        return total-pairs;
    }
}