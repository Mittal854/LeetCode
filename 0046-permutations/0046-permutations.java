class Solution {
    public void helper(int[] nums,List<Integer>one,List<List<Integer>> ans)
    {
        if(one.size()==nums.length)
        {
            ans.add(new ArrayList<>(one));
            return;
        }
        for(int i:nums)
        {
            if(!one.contains(i))
            {
                one.add(i);
                helper(nums,one,ans);
                one.remove(one.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>one=new ArrayList<>();
        helper(nums,one,ans);
        return ans;
    }
}