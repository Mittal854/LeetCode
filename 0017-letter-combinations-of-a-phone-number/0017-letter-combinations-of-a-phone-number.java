class Solution {
    public void helper(int index,StringBuilder sb,String digits,ArrayList<String>letters,List<String>ans)
    {
        if(index==digits.length())
        {
            ans.add(sb.toString());
            return;
        }
        int pos=digits.charAt(index)-'0';
        String val=letters.get(pos);
        for(int i=0;i<val.length();i++)
        {
            sb.append(val.charAt(i));
            helper(index+1,sb,digits,letters,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        ArrayList<String>letters=new ArrayList<>(Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
        List<String>ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        StringBuilder sb=new StringBuilder();
        helper(0,sb,digits,letters,ans);
        return ans;
    }
}