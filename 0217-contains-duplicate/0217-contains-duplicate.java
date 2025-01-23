class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        return nums.length-set.size()>0;
    }
}