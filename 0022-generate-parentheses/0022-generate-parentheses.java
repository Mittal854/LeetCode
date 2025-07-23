class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dfs(0,0,sb,n,ans);
        return ans;
    }
    public void dfs(int open,int close,StringBuilder s,int n, List<String>ans)
    {
        if(open==close && open==n)
        {
            ans.add(new String(s.toString()));
            return;
        }
        if(open<n)
        {
            s.append("(");
            dfs(open+1,close,s,n,ans);
            s.deleteCharAt(s.length()-1);
        }
        if(close<open)
        {
            s.append(")");
            dfs(open,close+1,s,n,ans);
            s.deleteCharAt(s.length()-1);

        }
    }
}