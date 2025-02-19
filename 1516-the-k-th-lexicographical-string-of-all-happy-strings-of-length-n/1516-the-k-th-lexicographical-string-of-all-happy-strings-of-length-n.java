class Solution {
    public void helper(StringBuilder sb,String letters,ArrayList<String>ans,int n)
    {
        if(sb.length()==n)
        {
            ans.add(sb.toString());
            return;
        }
        for(int i=0;i<3;i++)
        {
            if(sb.length()==0 ||sb.charAt(sb.length()-1)!=letters.charAt(i))
            {
                sb.append(letters.charAt(i));
                helper(sb,letters,ans,n);
                sb.deleteCharAt(sb.length()-1);
            }
            
        }
    }
    public String getHappyString(int n, int k) {
        ArrayList<String>ans=new ArrayList<>();
        String letters="abc";
        StringBuilder sb=new StringBuilder();
        helper(sb,letters,ans,n); 
        Collections.sort(ans);
        return ans.size()<k?"":ans.get(k-1);
    }
}