class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        for(int num:nums)
        {
            if(!set.add(num)) ans.add(num);
        }
        return ans;
    }
}