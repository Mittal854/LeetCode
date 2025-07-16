class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            if(!set.add(i)) return i;
        }
        return -1;
    }
}