class Solution {


    public void helper(int no,int sum,int k,int n,List<Integer>comb,List<List<Integer>>ans)
    {
        if(comb.size()==k&&sum==n)
        {
            ans.add(new ArrayList<>(comb));
            return;
        }
        if(sum>n || comb.size()>k) return;
        if(no>9) return ;
        
        helper(no+1,sum,k,n,comb,ans);
        comb.add(no);
        helper(no+1,sum+no,k,n,comb,ans);
        comb.remove(comb.size()-1);

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>comb=new ArrayList<>();
        helper(1,0,k,n,comb,ans);
        return ans;
    }
}