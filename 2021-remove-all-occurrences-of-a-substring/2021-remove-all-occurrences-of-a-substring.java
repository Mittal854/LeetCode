class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans=new StringBuilder();
        int n=part.length();
        for(int i=0;i<s.length();i++)
        {
            ans.append(s.charAt(i));
            if(ans.length()>=n && ans.substring(ans.length()-n).equals(part))
            {
                ans.setLength(ans.length()-n);
            }
        }
        return ans.toString();
    }
}