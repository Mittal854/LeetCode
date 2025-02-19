class Solution {
    public void helper(StringBuilder curr, int n, List<String> ans) {
        if (curr.length() == n) {
            ans.add(curr.toString());
            return;
        }
        for(char c:new char[]{'a','b','c'})
        {
            if(curr.length()==0||curr.charAt(curr.length()-1)!=c)
            {   
                curr.append(c);
                helper(curr,n,ans);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }

    public String getHappyString(int n, int k) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        helper(sb, n, ans);
        return ans.size() < k ? "" : ans.get(k - 1);
    }
}