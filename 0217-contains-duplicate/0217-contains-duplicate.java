class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            if(!set.add(num)) return true;
        }
        return false;
    }
}