class Solution {
    public void helper(String curr, int n, List<String> ans) {
        if (curr.length() == n) {
            ans.add(curr);
            return;
        }
        for(char c:new char[]{'a','b','c'})
        {
            if(curr.length()==0||curr.charAt(curr.length()-1)!=c)
            {
                helper(curr+c,n,ans);
            }
        }
    }

    public String getHappyString(int n, int k) {
        List<String> ans = new ArrayList<>();
        helper("", n, ans);
        return ans.size() < k ? "" : ans.get(k - 1);
    }
}