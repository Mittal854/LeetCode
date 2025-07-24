class Solution {
    public void helper(int[] nums,List<Integer>one,HashSet<List<Integer>> ans,boolean[] visited)
    {
        if(one.size()==nums.length)
        {
            ans.add(new ArrayList<>(one));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                one.add(nums[i]);
                helper(nums,one,ans,visited);
                one.remove(one.size()-1);
                visited[i]=false;
            }
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>>ans=new HashSet<>();
        List<Integer>one=new ArrayList<>();
        helper(nums,one,ans,new boolean[nums.length]);
        return new ArrayList<>(ans);
    }
}